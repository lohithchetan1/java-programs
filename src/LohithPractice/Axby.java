package LohithPractice;

public class Axby {
	public static void main(String[] args) {
		String s="abc" + "def";
		for(int i=0;i<s.length()/2;i++) {
			
			String add=""+s.charAt(i)+s.charAt(s.length()/2+i);
			System.out.print(add);
		}
		
		}
		
}
