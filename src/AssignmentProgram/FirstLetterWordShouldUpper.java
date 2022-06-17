package AssignmentProgram;

public class FirstLetterWordShouldUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s= "welcome to india";
       String[] str = s.split(" ");
       for(int i=0;i<str.length;i++)
       {
    	   String s1=""+ str[i].charAt(0);
    	   System.out.println(s1.toUpperCase());
       }
	}

}
