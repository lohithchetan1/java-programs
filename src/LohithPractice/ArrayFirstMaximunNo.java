package LohithPractice;

public class ArrayFirstMaximunNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,30,50,20,14};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
		}
		System.out.println(a[1]);
		

	}

}
