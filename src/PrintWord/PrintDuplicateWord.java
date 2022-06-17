package PrintWord;

import java.util.LinkedHashSet;

public class PrintDuplicateWord {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="welcome To Tyss welcome to bangalore";
        String [] str =s.split(" ");
        //step1 : create any set collection and add all the character of given string into set
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for(int i=0;i<str.length;i++)//0<4 //1<4 //2<4 //3<4 //4<4
        {
        	set.add(str[i]);//j //a //v //duplicate a //stop
        }        
        
        for (String string : set) { // set ={;,a,v}
        	//ch=j //ch=a
        	int count=0;     //0->1 //0->1
        	//step2 : compare each character of set with all the character of given string
        	for(int i=0;i<str.length;i++)  //0<4 //1<4 //3<4  //4<4
        	{
        		if(string.equals(str[i]))
        		{ //j==j //j==a //j==v //j==a (//a==j //a==a //a==v //a==a )
        			//step3 : if character matches  increment the count
        			count++;
        		}
        	}
        	//step :4 print both charcter set and count
        	if(count>1)
        	System.out.println(string +" "+count); //j=1 //a=2
        	
        	
        }
	}}


