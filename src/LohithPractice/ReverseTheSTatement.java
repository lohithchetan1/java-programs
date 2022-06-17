package LohithPractice;

public class ReverseTheSTatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to TYss";
		String rev=" ";
		String[] s1=s.split(" ");
		
		
		for(int i=s1.length-1;i>=0;i--)
		{
			rev=rev+s1[i]+" ";
		}
System.out.println(rev);
	}

}
