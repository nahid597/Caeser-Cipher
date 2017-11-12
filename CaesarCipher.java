package ru.ac.bd;

import edu.duke.FileResource;
public class CaesarCipher {
	
	
	public String encrypt(String string,int key)
	{
		char character;
		int tmp;
		String str = "";
		for(int i=0;i<string.length();i++)
		{
			character = string.charAt(i);
			tmp = (int)character;
			if(tmp<90)
			{
				tmp = tmp-65+key;
			}
			else
			{
				tmp = tmp-97+key;
			}
			//System.out.print(tmp);
			tmp = tmp%26;
			if((int)character<=90 && (int)character>=65)
				str = str + (char)(65+tmp);
			else if((int)character<=122 && (int)character>=97)
				str = str + (char)(97+tmp);
			else
				str = str + character;
		}
		return str;
	}
	
	public String encryptTwoKeys(String string,int key1, int key2)
	{
		char character;
		int tmp;
		String str = "";
		for(int i=0;i<string.length();i++)
		{
			character = string.charAt(i);
			tmp = (int)character;
			if(i%2 == 0)
			{
				if(tmp<90)
				{
					tmp = tmp-65+key1;
				}
				else
				{
					tmp = tmp-97+key1;
				}
			}
			else
			{
				if(tmp<90)
				{
					tmp = tmp-65+key2;
				}
				else
				{
					tmp = tmp-97+key2;
				}
			}
			//System.out.print(tmp);
			tmp = tmp%26;
			if((int)character<=90 && (int)character>=65)
				str = str + (char)(65+tmp);
			else if((int)character<=122 && (int)character>=97)
				str = str + (char)(97+tmp);
			else
				str = str + character;
		}
		return str;
	}
	
	
	
	public static void main(String[] args)
	{
		CaesarCipher object = new CaesarCipher ();
		object.testCaesar();
	}

	private void testCaesar() {

		FileResource fr = new FileResource(); 
		String message = fr.asString(); 
		String tmps = message;
		System.out.print(message);
		String encrypted = encrypt(message, 23);
		System.out.println(encrypted);
		encrypted = encryptTwoKeys(tmps, 23, 17);
		System.out.println(encrypted);
		
	}



}
