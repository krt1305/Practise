package StringQuestions;

import java.util.ArrayList;

public class RepeatedString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String original = "rabiarabiaGoodGoodGood"; 
		StringBuilder result =new StringBuilder(); 
		ArrayList<Character> arr=new ArrayList<Character>(); 
		for(char c: original.toCharArray()) 
		{ 
			if (!arr.contains(c)) 
			{ 	arr.add(c); 
				result.append(c);
			} 
		} 
	   System.out.println(result);

	}

}
