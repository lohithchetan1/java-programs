package LohithPractice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int n=17, count=0;
	if(n>1) {
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2) {
		System.out.println("given no is prime no");
	}
		else
			{
			System.out.println("given no is not prime");
			}
	}else {
		System.out.println("not aaa prime..not.");
	}
	
}}
