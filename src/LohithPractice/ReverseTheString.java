package LohithPractice;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	reverse string by using length
		String s= "abcd";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);	
			
		}
		System.out.println("reverse string is "+rev);
*/
	//	reverse string without using length but by array
		String s = "abcd";
		String rev  =" ";
		char a[] = s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+a[i];
			
		}
		System.out.println("reverse by arry is " +rev);
		
		
		
		

	}

}
