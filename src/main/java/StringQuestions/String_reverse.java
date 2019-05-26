package StringQuestions;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAY 1
		
		String name="I am rabia";
		String[] name_split=name.split(" ");
	
		int n=name_split.length;
		String reversed_name = "";
		System.out.println("Size is"+ name_split.length);
		for(int i=n-1;i>=0;i--)
		{
			System.out.println("In for loop "+i);
			System.out.println(name_split[i]);
			reversed_name=reversed_name+" " +name_split[i];
		}
		
		System.out.println("Final reversed name is "+reversed_name);
		
		
		
		

	}

}
