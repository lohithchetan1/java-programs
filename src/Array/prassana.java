package Array;

public class prassana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 String s1 = "welcome to tyss";
		 String s[] =  s1.split(" ");

		for(int i=0; i<s.length; i++)
		{
		String s2=s[i];
		for(int j=s2.length()-1; j>=0; j--)
		{
		System.out.print(s2.charAt(i));
		}
		System.out.print(" ");
		}
		}

		

	}

