package PrakashSir;


public class Fibonas {

	public static void main(String[] args) {
	int num =4;
	int a=1;
	int b=1;
	System.out.println(a+" ");
	System.out.println(b+ " ");
	for(int i=1;i<=num;i++)
	{
		int res = a+b;
		System.out.print(res+" ");
		a=b;
		b=res;
	}

	}

}