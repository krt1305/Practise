package Array;

public class FirstRepeatingElement {

    public static void main(String[] args) {
        int a[]={1,5,6,7,8,8};
        int occur[]=new int[100];
        int result=0;

        for(int i=0;i<=occur.length-1;i++)
        {
            result=occur[a[i]]++;
            System.out.println(a[i] +"--"+result);
            if(result==1)
            {
                System.out.println("first repeating is " + a[i]);
                break;
            }


        /*   if(occur[a[i]]==1) {
               System.out.println("first repeating is " + a[i]);
               break;
           }*/

        }

        System.out.println("result "+result);
    }
}
