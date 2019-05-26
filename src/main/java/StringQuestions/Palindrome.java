package StringQuestions;

public class Palindrome {

	public static void main(String[] args) 
	{
		String name="rab";
		String reverse="";
		char[] charArray=name.toCharArray();
		for(int i=charArray.length-1;i>=0;i-- )			
		{
			System.out.println("I is "+i);
			reverse=reverse+charArray[i];
			
		}
		System.out.println("Reversed string is "+reverse);
		if(name.equals(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
