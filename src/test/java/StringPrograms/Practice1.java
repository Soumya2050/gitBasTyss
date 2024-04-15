package StringPrograms;

import java.util.ArrayList;

public class Practice1 {
	
	public static void main(String[] args) {
		
		String s="india";
//		a3b1c1d1c2d2
		ArrayList<Object>list = new ArrayList<>();
		char ch =s.charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}else {
				list.add(ch);
				list.add(count);
				count=1;
				ch=s.charAt(i);
			}
		}
		list.add(ch);
		list.add(count);
		
		for (Object object : list) {
			System.out.print(object);
		}
	}

}
