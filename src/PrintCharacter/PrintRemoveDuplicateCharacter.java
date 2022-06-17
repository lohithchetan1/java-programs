package PrintCharacter;

import java.util.LinkedHashSet;

public class PrintRemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="java";
        //step1 : create any set collection and add all the character of given string into set
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for(int i=0;i<s.length();i++)//0<4 //1<4 //2<4 //3<4 //4<4
        {
        	set.add(s.charAt(i));//j //a //v //duplicate a //stop
        }
        System.out.println(set);
        for(Character ch : set)
        {
        	System.out.println(ch);
        }
}
}