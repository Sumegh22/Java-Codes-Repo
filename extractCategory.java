
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
// 		Scanner sc = new Scanner(System.in);
// 		int i= sc.nextInt();
		
		String statement = "We have some category:A "+"along with some category:B and category:C which are very famous in the market lately";
	      
	      extractCat(statement);
	      
	}
	
	
	public static void extractCat(String str)
	{
	    int i=0;
	    
	    
	    
	    
	     while (true)
	 
        {
            int found = str.indexOf("category:",i);
            if (found == -1) break;
            
	        int start= found + 9;
	        int end = str.indexOf(" ",start);
	            System.out.println(str.substring(start,end));
                   i= end+1; 
                          
                    
                                }
                    
                   
                    
	}
	
}
