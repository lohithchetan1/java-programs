package PracticeLOh;

public class FirstWordToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to tyss";
		String[] str=s.split("");
		for(int i=0;i<str.length;i++){
			String s1=""+str[i].charAt(0);
			System.out.print(s1.toUpperCase()+str[i].substring(1)+"");
		}

	}

}
