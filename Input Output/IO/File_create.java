package IO;
import java.io.File;
import java.io.IOException;

public class File_create {
    public static void main(String[] args) {
        String path = "C:\\Local volume\\Programming\\Java\\IO\\";
        String fileName = "Sushant.txt";
        File obj = new File(path + fileName);

        try {
            if (obj.exists()) {
                for (int count = 1; obj.exists(); count++) {
                    fileName = "Sushant" + count + ".txt";
                    obj = new File(path + fileName);
                }
            }
            if (obj.createNewFile()) {
                System.out.println("File " + obj.getName() + " is created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error");
            exception.printStackTrace();
        }
    }
}