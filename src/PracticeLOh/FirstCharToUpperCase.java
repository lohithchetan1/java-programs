package PracticeLOh;

public class FirstCharToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Lohith";
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				String s1=""+s.charAt(i);
				System.out.print(""+s1.toUpperCase());
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}

	}

}
