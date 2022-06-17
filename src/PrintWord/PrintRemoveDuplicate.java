package PrintWord;

import java.util.LinkedHashSet;

public class PrintRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="java is very very easy easy";
        String[] str=s.split(" ");
        //step1 : create any set collection and add all the character of given string into set
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for(int i=0;i<str.length;i++)//0<4 //1<4 //2<4 //3<4 //4<4
        {
        	set.add(str[i]);//j //a //v //duplicate a //stop
        }
        System.out.println(set);
        for(String ch : set)
        {
        	System.out.print(ch+" ");
        }
}
}