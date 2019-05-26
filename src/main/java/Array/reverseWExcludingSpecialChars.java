package Array;

public class reverseWExcludingSpecialChars {

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        String str="ab&*xz";
        char temp;
        int pt1=0,ptr2=str.length()-1;
        char charArray[]=str.toCharArray();



            while(pt1<ptr2)
            {
                if(!isAlphabet(charArray[pt1])) {
                    pt1++;
                }
                else if(!isAlphabet(charArray[ptr2]))
                {
                    ptr2--;

                } else  {

                        temp = charArray[pt1];
                        charArray[pt1] = charArray[ptr2];
                        charArray[ptr2] = temp;
                        pt1++;
                        ptr2--;
                }
            }

        System.out.println(String.copyValueOf(charArray));



    }

    public static boolean isAlphabet(char c)
    {
        if ((c >= 'A' && c <= 'Z') || c >= 'a' && c <= 'z')
        return  true;
        else
            return false;
    }
}
