package LohithPractice;

import java.util.Scanner;

public class PalidomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String Str=s.next();
		String rev="";
		String orgStr=Str;
		
		for(int i=Str.length()-1;i>0;i--)
		{
			rev=rev+Str.charAt(i);
		}
		if(orgStr.equals(rev)) {
			System.out.println("is not palidom string");
		}
		else
		{
			System.out.println("is  palidom");
		}			
		

	}
	

}
