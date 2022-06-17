package AssignmentProgram;

public class SwappingTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String s2="selenium";
		
		s1=s1+s2; //javaselenium
		s2=s1.substring(0,s1.length()-s2.length());  //javaselenium-selenium=java
		s1=s1.substring(s2.length());  //javaselenium(starts from s2(4th index)where s2 is selenium)
		
System.out.println("s1 wil be swapped from java to ="  + s1);
System.out.println("s2 will be swaped from selenium to  =" + s2);
	}

}
