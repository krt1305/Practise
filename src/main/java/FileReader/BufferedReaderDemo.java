package FileReader;

import java.io.*;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        File file=new File("/Users/rabia/Desktop/file1.txt");
        BufferedReader bufferedReader= null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String st;
        while((st = bufferedReader.readLine()) != null){

            System.out.println(st);
        }

    }
}
