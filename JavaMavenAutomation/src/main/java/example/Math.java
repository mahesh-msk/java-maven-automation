package example;

public class Math {
	public static int  add(int a, int b) {
		int result = a+b;
		System.out.println(String.format("The sum of %d, %d number is: "+ Integer.toString(result),a,b) );
		return result;
	}
	
	public static int  sub(int a, int b) {
		int result = a-b;
		System.out.println(String.format("The subtraction of %d, %d number is: " + Integer.toString(result),a,b));
		return result;
	}
}
