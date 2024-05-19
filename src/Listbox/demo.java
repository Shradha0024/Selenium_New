package Listbox;

import java.util.ArrayList;

public class demo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("rahul");
		a1.add("mahesh");
		a1.add("deepa");
		a1.add("ramesh");
		
		for(String s1:a1)
		{
			System.out.println(s1.toUpperCase());
		}
		
	}

}
