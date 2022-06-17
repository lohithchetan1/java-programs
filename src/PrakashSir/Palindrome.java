package PrakashSir;

public class Palindrome {

	public static void main(String[] args) {
		int num = 141;
		int temp=num;
		int reverse=0;
		while(num>0) {
			int remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
        if (temp==reverse) {
        	System.out.println(temp+ "is a palindrome");
        	
        }
        else {
        	System.out.println(temp+ "is not a palindrome");
        }

	}

}