package PracticeLOh;

public class SumOfEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123,mod=0,sum=0;
		for(int i=0;i<n;i++) {
			mod=n%10;
			sum=sum+mod;
			n=n/10; 		
		}
		System.out.println(sum);

	}

}
