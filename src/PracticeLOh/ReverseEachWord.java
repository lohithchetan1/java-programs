package PracticeLOh;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to testyantra";
		String [] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			String s1=str[i];
			String rev=" ";
			for(int j=s1.length()-1;j>=0;j--) {
				rev=rev+s1.charAt(j);				
			}
			System.out.print(rev);
		}

	}

}
