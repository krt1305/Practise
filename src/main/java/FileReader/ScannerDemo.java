package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ScannerDemo {

    public static void main(String[] args) {
        File file=new File("/Users/rabia/Desktop/file1.txt");
        Scanner scanner= null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scanner.nextLine()!=null)
        {
            System.out.println(scanner.nextLine());
        }

    }
}
