package PracticeLOh;

public class Palidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=121,rev=0,mod=n;
	while(n>0) {
		rev=rev*10+n%10;
		n=n/10;
			}
	if(mod==rev) {
		System.out.println("palidrome");
	}
	else
	{
		System.out.println("not palidrome");
	}

	}

}
