import java.util.Scanner;

/**
	Класс запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner {
	
	public static void main(String[] args) throws MyException{
		/*
			Сканер для считывания вводимого текста (открываем поток ввода)
		*/
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			String saveResult = "yes";
			/*
				Цикл проверяющий выходить из калькулятора или нет
			*/
			while(!exit.equals("yes")){
					System.out.println("Enter first arg : ");
					Double first = Double.valueOf(reader.next());
				/*
					Цикл отвечает за работу с результатом
				*/
				while(!saveResult.equals("no")){
					System.out.println("Enter operation \"+\", \"-\", \"/\", \"*\" : ");
					String action = reader.next();
					System.out.println("Enter second arg : ");
					Double second = Double.valueOf(reader.next());
					if(action.equals("+")){
							calc.plus(first, second);
					}
					else if(action.equals("-")){
							calc.minus(first, second);
					}
					else if(action.equals("/")){
							calc.div(first, second);
					}
					else if(action.equals("*")){
							calc.multiply(first, second);
					}
					System.out.println("Result : " + calc.getResult());
					System.out.println("Continue operation : yes/no ");
					saveResult = reader.next();
					/*
						Если продолжаем работу с результатом, то записываем 
						его в первое число и сразу выбираем действие
					*/
					if(!saveResult.equals("no")){
						first = calc.getResult();
						calc.cleanResult();
					}
				}
				calc.cleanResult();
				System.out.println("Exit : yes/no ");
				exit = reader.next();
			}
		} finally {
		reader.close(); // закрываем поток ввода
		}
	}
}
