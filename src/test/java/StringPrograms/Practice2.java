package StringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.testng.annotations.Test;

public class Practice2 {
	
	public static void main(String[] args) {
		
		String s="aaabcdccddefeeeettttttt";
//		a3b1c1d1c2d2
		String s1="";
		int count=1;
		int cnt=0;
		char ch=' ';
		for (int i = 0; i < s.length(); i++) {
			 ch=s.charAt(i);
//			System.out.print(ch);
			 
			count=1;
			for (int j =i+1; j < s.length(); j++) {
				
				if(ch==s.charAt(j))
				{
					count++;
					
				}else if(ch!=s.charAt(j))
				{
					i=j-1;	
					System.out.print(ch+""+count);
					break;
				}
			}
			if(ch==s.charAt(s.length()-1))
				cnt=count+2;
		}
		System.out.print(ch+""+cnt);
		
	}
	
	@Test
	public void ArrayListIntoArray() {
		
		ArrayList<Integer>list = new ArrayList<>();
		list.add(10);list.add(20);list.add(30);
		
//		list.toArray();
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i)+"---"+(i+1));
		}
	}

}
