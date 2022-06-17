package PracticeLOh;

public class FirstMinNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,5,2,7,9,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int ref=a[i];
					a[i]=a[j];
					a[j]=ref;
							
				}
			}
			
		}
		System.out.println(a[3]);

	}

}
