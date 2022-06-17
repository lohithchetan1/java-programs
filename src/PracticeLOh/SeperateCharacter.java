package PracticeLOh;

public class SeperateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abAB12@$";
		String alp="";
		String num="";
		String spl="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z') {
				alp=alp+s.charAt(i);}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				num=num+s.charAt(i)+" ";
			}
			else {
				spl=spl+s.charAt(i);
			}
				
		}

		System.out.println(alp);
		System.out.println(num);
		System.out.println(spl);

	}

}
