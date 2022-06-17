package PrakashSir;
public class FibonacyWithLimit {

	public static void main(String[] args) {
		int num =10,a=0,b=1;
		
		//System.out.print(a +" "+ b +" ");
	
		for(int i=1;i<=num;i++)
		{
			int res = a+b;
			if(res<=100) {
			System.out.print(res+" ");			
			a=b;
			b=res;
			}
		}
	}
}