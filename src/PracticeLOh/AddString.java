package PracticeLOh;

public class AddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="cat"+"rat";
		for(int i=0;i<s.length()/2;i++) {
			String s1=""+s.charAt(i)+s.charAt(s.length()/2+i);
			System.out.println(s1);
		}

	}

}
