package PracticeLOh;

import java.util.LinkedHashSet;

public class PrintNoOfOccWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to TYSS";
		String[] str=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		System.out.println(set);
		
		for(String sg : set) {
			int count=0;
			
			for(int i=0;i<str.length;i++) {
				if(sg.equals(str[i])) {
					count++;
				}
			}
			
				System.out.println(sg+  "" +count);
		}

	
		

	}

}
