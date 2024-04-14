import java.io.FileWriter;
import java.io.IOException;

public class File_Write {
    public static void main(String [] args)
    {
      try{
        FileWriter fwrite = new FileWrite("Sushant.txt",true);
        fwrite.write("\nHelloworld this is sushant");
        fwrite.close();
        System.out.println("Content is successfully written in file");
      
      }  catch(IOException e)
      {
        System.out.println("unexpected error");
        e.printStackTrace();
      }
    }
}


