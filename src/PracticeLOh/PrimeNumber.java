package PracticeLOh;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=1,count=0;
	
	for(int i=1;i<=n;i++) {
		if(n%i==0)
		count++	;	
	}
	
	if(count==2) {
		System.out.println("is prime ");
	}
	else {
		System.out.println("not a prime");
	}
	

}
	
}
