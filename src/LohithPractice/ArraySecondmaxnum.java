package LohithPractice;

public class ArraySecondmaxnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,5,2,1,8,9};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					int ref=a[i];
					a[i]=a[j];
					a[j]=ref;
				}
			}
		}
		//System.out.println(a[2]);
		for(int num :a) {
			System.out.print(num +" ");
		}

	}

}
