package PracticeLOh;

public class SwapTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String s2="selenium";
		System.out.println("before swap  "+ s1   +s2);
		s1=s1+s2;//javaselenium
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("after swap  "+ s1   +s2);


	}

}
