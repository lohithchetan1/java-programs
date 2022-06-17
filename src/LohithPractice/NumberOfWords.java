package LohithPractice;

import java.util.LinkedHashSet;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome welcome  to karnataka";
		String[] str=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);			
		}
		//System.out.println(set);
		
		for(String string : set) {
			int count=0;
			for(int i=0;i<str.length;i++) {
				if(string.equals(str[i]))
					count++;
			}
			//(count==0)
			if(count>0){
			System.out.println(string+""+count);}
		}

	}}


