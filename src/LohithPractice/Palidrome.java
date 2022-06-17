package LohithPractice;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter a numbers");
		int n=s.nextInt();
		int rev=0;
		int oriNum=n;
		
		while(n!=0) {
			rev=rev*10 + n%10;
			n=n/10;			
		}
		if(oriNum==rev) {
		System.out.println("is palidominal");
		}
		else
		{
			System.out.println("is not palidome");
		}			
	}
}
