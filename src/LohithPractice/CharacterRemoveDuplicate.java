package LohithPractice;

import java.util.LinkedHashSet;

public class CharacterRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Karnataka";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
		set.add(s.charAt(i));
		}
		System.out.println(set);
		
		for(Character ch : set) {
			System.out.println(ch);
		}
		

	}

}
