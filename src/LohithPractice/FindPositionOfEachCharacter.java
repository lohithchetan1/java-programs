package LohithPractice;

import java.util.LinkedHashSet;

public class FindPositionOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Tester";
		String str=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
		set.add(str.charAt(i));}
		System.out.println(set);
		
		for(Character ch : set)
		{
			for(int i=0;i<str.length();i++) {
				if(ch==str.charAt(i)) {
				System.out.println(ch + ""+(i+1));
				break;}
			}
		}
		
		
		

	}

}
