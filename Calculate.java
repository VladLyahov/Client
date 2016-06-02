public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate work");
		double result;
		double first = Double.valueOf(args[0]);
		String action = args[1];		
		double second = Double.valueOf(args[2]);
		
		if(action.equals("+")){
			result = first + second;
		}
		else if(action.equals("-")){
			result = first - second;
		}
		else if(action.equals("/")){
			result = first / second;
		}
		else if(action.equals("*")){
			result = first * second;
		}
		else if(action.equals("^")){
			result = Math.pow(first, second);
		}
		else{
			result = 0;
		}
		System.out.println("Result = " + result);
		
		
	}
}
