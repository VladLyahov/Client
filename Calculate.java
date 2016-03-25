public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate work");
		double result;
		double first = Double.valueOf(args[0]);
		String stringAction = args[1];		
		double second = Double.valueOf(args[2]);
		char action = stringAction.charAt(0);
		if(action == '+'){
			result = first + second;
			
		}
		else if(action == '-'){
			result = first - second;
		}
		else if(action == '/'){
			result = first / second;
		}
		else if(action == '*'){
			result = first * second;
		}
		else if(action == '^'){
			result = Math.pow(first, second);
		}
		else{
			result = 0;
		}
		System.out.println("Result = " + result);
		
		
	}
}
