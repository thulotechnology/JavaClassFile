import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("abc.txt");
            fw.write("Hello How are you?");
            fw.close();
            System.out.println("Wrote successful.");
        }catch (Exception ex){
            System.out.println("Something went wrong.");
        }


    }
}
// Create a file called name.txt and write your name inside it.