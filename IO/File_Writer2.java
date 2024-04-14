import java.io.FileWriter;
import java.io.IOException;

public class File_Writer2 {
    public static void main(String [] args) {
        try {
            FileWriter fwrite = new FileWriter("Sushant.txt", true);
            
            fwrite.write("\nHello world, this is sushant"); 
            fwrite.close();
            
            System.out.println("Content is successfully appended to the file.");
        } catch(IOException e) {
            System.out.println("Unexpected error occurred.");
            e.printStackTrace();
        }
    }
}
