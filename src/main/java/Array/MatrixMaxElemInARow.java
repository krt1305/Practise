package Array;

public class MatrixMaxElemInARow {

    public static void main(String[] args) {
        int[][] arr =     {{1,2,3},
                            {4,5,6},
                {100,1,9}};

        int max=0;
        for(int i=0;i<=2;i++)
        {
            max=0;
            for(int j=0;j<=2;j++)
            {
                System.out.println("Elem "+arr[i][j]);
              //  max=arr[i][j];
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }

            System.out.println("Max is "+max);
        }





    }
}
