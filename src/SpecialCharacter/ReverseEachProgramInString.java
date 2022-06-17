package SpecialCharacter;

public class ReverseEachProgramInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s="Welcome to TYss company";
		String[] str =s.split(" ");
		String rev =  "";
		for(int i=str.length-1;i>=0;i--)
		{
			rev = rev+str[i]+ " ";
			
		}
		System.out.println(rev);
		
		

	}

}
