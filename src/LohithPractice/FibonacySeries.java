package LohithPractice;

public class FibonacySeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,sum=0,n=10;
		System.out.print(n1 + " " +n2);
	//	while(n>20) 
		
		for(int i=2;i<=n;i++) {
			sum=n1+n2;
			if(sum<=100) {
			System.out.print(" " +sum);
			n1=n2;
			n2=sum;}	}	

	}

}
