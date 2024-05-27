package IO;
import java.io.File;
import java.io.IOException;
public class Create {
    public static void main(String[] args) {
        
    // try{
    File obj=new File("C:\\Local volume\\Programming\\Java\\IO\\Sushant.txt");
//     if(obj.createNewFile()){
        System.out.println("File "+obj.getName()+" is created successfully");
//     } else{
//         System.out.println("File is already exist");
//     }
// }catch(IOException exception){
//     System.out.println("An unexpected error");
//     exception.printStackTrace();
// }
    System.out.println("path: "+ obj.getAbsolutePath());
    System.out.println("Writeable: "+ obj.canWrite());
    System.out.println("Readable: "+obj.canRead());
    System.out.println("Length in bytes: "+obj.length());



}
    }
    