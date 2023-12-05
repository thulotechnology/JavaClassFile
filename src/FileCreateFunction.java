import java.io.File;

public class FileCreateFunction {
    public static void main(String[] args) {

    String[] names = {"Shashi", "Ganesh", "Istar", "Bishworaj"};
    for(String name: names){
        createFile(name+".txt");
    }

//    for(int i = 1; i<=100; i++){
//        deleteFile(i+".txt");
//    }
    }

    public static void createFile(String fileName){
        try{
            File f = new File("C:\\Users\\digit\\OneDrive\\Desktop\\hello\\"+fileName);
            if(f.createNewFile()){
                System.out.println("File created successfully.");
            }else{
                System.out.println("File already exists.");
            }
        }catch (Exception e){
            System.out.println("Something went wrong while creating file."+e.getMessage());
        }
    }

    public static void deleteFile(String fileName){
        try{
            File f = new File("C:\\Users\\digit\\OneDrive\\Desktop\\hello\\"+fileName);
            if(f.delete()){
                System.out.println("File deleted successfully.");
            }else{
                System.out.println("Error while deleting file.");
            }
        }catch (Exception e){
            System.out.println("Something went wrong while creating file."+e.getMessage());
        }
    }

}
