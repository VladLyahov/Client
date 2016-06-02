/**
	Класс реализует калькулятор
*/
public class Calculator{

	/**
		Результат вычисления
	*/
	private double result;
	
	/**
		Суммирует аргументы
		@param params Аргументы суммирования
	*/
	public void add(double ... params){
		for(Double param : params){
			this.result += param;
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
		this.result = 0;
	}
}
