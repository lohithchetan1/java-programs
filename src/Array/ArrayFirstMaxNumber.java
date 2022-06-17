package Array;

public class ArrayFirstMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {3,2,6,4,9,8};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if( a[i]>a[j]) {
					int ref=0;
					a[i]=ref;
					a[i]=a[j];
					a[j]=ref;
					
				}
			}
		}
		System.out.println(a[1]);

	}

}
