package StringQuestions;

public class BinaryStringComplement {

    public static void main(String[] args) {
        String s1="1001";
        char[] ch=s1.toCharArray();
        StringBuffer bf=new StringBuffer();
        String finalString="";


     /*   for(Character chars:ch)
        {
            System.out.println("Chars is "+chars);
            if(chars=='0')
            {
                System.out.println("IN if condition");
                finalString=finalString+1;
                System.out.println("After appending 1 "+finalString);
            }

            else
            {
                System.out.println("In else condition");
                finalString=finalString+0;
                System.out.println("After appending 0 "+finalString);
            }

        }
*/
        for(Character chars:ch)
        {

            System.out.println("Char is "+chars);
            bf=  chars=='0' ? bf.append(1):bf.append(0);
            System.out.println("Bf is "+bf);
        }

        String s="10+1";
        System.out.println("S "+s);
    }
}
