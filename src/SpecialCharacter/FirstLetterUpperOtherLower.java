package SpecialCharacter;

public class FirstLetterUpperOtherLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "stone";
		
		for(int i=0;i<s.length();i++)
		{
			if(i==0)
			{
			/*String s1=s.charAt(i);
			System.out.println(s1.toUpperCase());
			*/
				char ch =(char)(s.charAt(i)-32);
			System.out.print(ch);
		}
		else {
			System.out.print(s.charAt(i));
		}

	}
	}
}

