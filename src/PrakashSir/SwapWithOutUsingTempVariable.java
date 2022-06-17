package PrakashSir;

public class SwapWithOutUsingTempVariable {

	public static void main(String[] args) {
	
		String a= "Hello";
		String b= "World";
		
		System.out.println("Before Swaping:");
		System.out.println("The Value of a is:"+a);
		System.out.println("The Value of b is:"+b);
		
		a=a+b;
		
		b= a.substring(0,a.length()-b.length());
		
		a= a.substring(b.length());
		
		System.out.println("the value of a and b afer swapping");
		
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);

	}

}