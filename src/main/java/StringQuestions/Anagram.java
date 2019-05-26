package StringQuestions;

public class Anagram {

	public static void main(String args[])
	{
		
		String s1="rabia";
		String s2="aibarss";
		int l1=s1.length();
		int l2=s2.length();
		boolean found = false;
		if(l1!=l2)
		{
			System.out.println("Both are not anagrams....");
		}
		else
		{
				for(int i=0;i<=l1-1;i++)
				{
					for(int j=0;j<=l2-1;j++)
					{
					      if(s1.charAt(i)==s2.charAt(j))
					      {
					    	  found=true;
					    	  break;
					      }
						
						
					}
					if(found==false)
					{
						System.out.println("Both are not anagrams");
					}
				}
			
			
		}
		if(found==false)
		{
			System.out.println("Both are not anagrams");
		}
		else
		{
			System.out.println("Both are anagrams");
		}
		
		
		
		
	}
	
}
