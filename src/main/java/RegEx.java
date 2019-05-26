import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String searchString="find me";
		Pattern p=Pattern.compile("find");
		Matcher m=p.matcher(searchString);
		
		while(m.find())
		{
			System.out.println("match found");
		}
		
		

	}

}
