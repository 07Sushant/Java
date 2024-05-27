package IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class read {
    public static void main(String[] args) {
        try{
            File f1 = new File("C:/Local volume/Programming/Java/IO/read.txt");
            Scanner dataReader = new Scanner(f1);
            while (dataReader.hasNextLine()) {
                String fileData=dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();
        }catch(FileNotFoundException exception)
        {
            System.out.println("unexpected error");
            exception.printStackTrace();
        }
    }   
}
