package LohithPractice;

import java.util.LinkedHashSet;

public class NumberOFCharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ind";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
		
		for(Character ch : set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			
		}
		
		System.out.println(ch + "  "+count);
	}

}
}
