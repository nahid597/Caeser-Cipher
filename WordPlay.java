package ru.ac.bd;
import java.util.*;

public class WordPlay {
	
	public boolean isVowel(char ch)
	{
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			return true;
		}
		else 
			return false;
		
	}
	
	public  String replaceVowels(String phrase, char c)
	{
		char arr[] = phrase.toCharArray();
		int i = 0,co = 0;
		for(char ch : arr)
		{
			co ++;
			if(isVowel(ch))
			{
				
				if(co % 2 == 0)
				arr[i] = '+';
				else
					arr[i] = c;
				
				
			}
			i ++;
			
		}
		String s = new String(arr);
		return s;
	}
	
	public static void main(String[] args)
	{
		
		WordPlay ob = new WordPlay();
		Scanner in = new Scanner(System.in);
		String p = in.nextLine();
		char c = '*';
	    String m = ob.replaceVowels(p, c);
		
		System.out.println(m);
				
		
	}
	

}
