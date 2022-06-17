package JavaPractice;

public class A {
	A(){
		System.out.println("a");
	}
	A(int a){
		System.out.println("b");
	}

}
 class B{
	 public static void main(String[] args)  {
		A obj=new A();
		A obj1=new A(10);
		
	}
}
