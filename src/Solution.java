import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("/Users/rabia/Desktop/file.txt")));

        System.out.println("hello");
        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> a = new ArrayList<>();

        for (int i = 0; i < aCount; i++) {
            System.out.println("in for loop");
            String aItem = bufferedReader.readLine();
            a.add(aItem);
        }


        int bCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> b = new ArrayList<>();

        for (int i = 0; i < bCount; i++) {
            String bItem = bufferedReader.readLine();
            b.add(bItem);
        }
        System.out.println("Getting result");

       List<Integer> result = Result.getMinimumDifference(a, b);

        for (int i = 0; i < result.size(); i++) {
        //    bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
             //   bufferedWriter.write("\n");
            }
        }

      //  bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }



}

