package LohithPractice;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,6,7,9},sum=0;
		//for(int i=0;i<=a.length-1;i++)
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("sum of array is ="+sum);

	}

}
