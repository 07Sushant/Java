package IO;
import java.util.Scanner;

public class Read_file {
    public static void main(String[] args) {
        try{
            File f1 = new File();
            Scanner dataReader = new Scanner(f1);
            while(dataReader.hasNextLine())
            {
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();
        }
    }    

}
