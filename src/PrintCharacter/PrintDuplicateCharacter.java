package PrintCharacter;

import java.util.LinkedHashSet;

public class PrintDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="nayana";
        //step1 : create any set collection and add all the character of given string into set
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for(int i=0;i<s.length();i++)//0<4 //1<4 //2<4 //3<4 //4<4
        {
        	set.add(s.charAt(i));//j //a //v //duplicate a //stop
        }
        System.out.println(set); // j a v
        for (Character ch : set) { // set ={;,a,v}
        	//ch=j //ch=a
        	int count=0;     //0->1 //0->1
        	//step2 : compare each character of set with all the character of given string
        	for(int i=0;i<s.length();i++)  //0<4 //1<4 //3<4  //4<4
        	{
        		if(ch == s.charAt(i))
        		{ //j==j //j==a //j==v //j==a (//a==j //a==a //a==v //a==a )
        			//step3 : if character matches  increment the count
        			count++;
        		}
        	}
        	//step :4 print both charcter set and count
        	if(count>1) {
        	System.out.println(ch +" "+count); //j=1 //a=2
        	
        	}
        }
	}

}
