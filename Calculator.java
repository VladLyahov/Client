/**
	Класс реализует калькулятор
*/
public class Calculator{

	/**
		Результат вычисления
	*/
	private Double result = null;
	
	/**
		Суммирует аргументы
		@param params Аргументы суммирования
	*/
	public void plus(double ... params)  throws MyException{
		if(params.length != 0){
		
			this.result = params[0] + params[1];
			
		}
		else{
			throw new MyException("Error! No args");
		}
	}
	/**
		Вычитает аргументы
		@param params Аргументы вычитания
	*/
	public void minus(double ... params) throws MyException{
		if(params.length != 0){
				this.result = params[0] - params[1];
		}
		else{
			throw new MyException("Error! No args");
		}
	}
	/**
		Умножает аргументы
		@param params Аргументы умножения
	*/
	public void multiply(double ... params) throws MyException{
		if(params.length != 0){
			this.result = params[0] * params[1];
		}
		else{
			throw new MyException("Error! No args");
		}
	}
	/**
		Делит аргументы
		@param params Аргументы деления
	*/
	public void div(double ... params) throws MyException{
		if(params.length != 0){
			if(params[1] != 0){
				this.result = params[0] / params[1];
			}
			else throw new MyException("Warning! Divided by 0");
		}
		else{
			throw new MyException("Error! No args");
		}
	}
	/**
		Получить результат вычисления.
	*/
	public double getResult(){
		return this.result;
	}
	/**
		Очистить результат
	*/
	public void cleanResult(){
		this.result = null;
	}
}
