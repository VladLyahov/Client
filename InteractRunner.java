import java.util.Scanner;

/**
	Класс запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner {
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				calc.add(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result : " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit : yes/no ");
				exit = reader.next();
			}
		} finally {
		reader.close();
		}
	}
}
