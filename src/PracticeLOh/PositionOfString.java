package PracticeLOh;

import java.util.LinkedHashSet;

public class PositionOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tester";
		String str=s.toLowerCase();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for(Character ch : set) {
			for(int i=0;i<s.length();i++) {
				if(ch==str.charAt(i)) {

					System.out.println(ch+ "" +(i+1));
					break;
				}
			}
		}
			

	}

}
