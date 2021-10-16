package com.medium.praticeProblems;

public class Extract_word_from_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "We have a large inventory of things in our warehouse falling in "
				+"the category:apperal and the slightly "
				+"more popular category:makeup along with category:furniture and...";

				// extract all the categories from the given string and print
		
				
		printcategories(str);
		
	}

	
	
	public static void printcategories (String s1)
	{
		int i  = 0;
	
		while (true)
		{
			int found = s1.indexOf("category:",i);
			int start = found +9;
			int end = s1.indexOf(" ",start);
			if (found==-1) break;

			System.out.println(s1.substring(start,end));
						
			i = found+1;
					}
			
		
		
	}
	
	
}
