import java.io.File;

public class FileMaker {
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\digit\\OneDrive\\Dsktop\\hello\\abc.txt");
            if(f.createNewFile()){
                System.out.println("File created successfully.");
            }else{
                System.out.println("File already exists.");
            }
        }catch (Exception e){
            System.out.println("Something went wrong while creating file."+e.getMessage());
        }
    }
}
// Create a file called contact.csv using Java.