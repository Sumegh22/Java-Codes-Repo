
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		String str= "Attack on Titans Season 2";
		int flag = str.length()-1;
		
		
		for(int i=0;i<str.length();i++)
		{
		    System.out.print(str.charAt(flag));
		    flag--;
		}
	}
}
