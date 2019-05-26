package FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader= null;
        try {
            fileReader = new FileReader("/Users/rabia/Desktop/file1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int i;
        while ((i=fileReader.read()) != -1)
            System.out.print((char) i);
    }
}

