import java.util.Scanner;

public class ArrayWorkNames {
    public static void main(String[] args) {
        // Scanner
        // Take 5 fruits from users and display them
        Scanner sc = new Scanner(System.in);
        //Creating 10 slot
        String[] names = {"","","","","","","","","",""};

        // store
        for(int i=0; i<names.length; i++){
            System.out.println("Enter name for ID "+(i+1)+ ": ");
            names[i]= sc.nextLine();
        }
        // display
        for(int i=0; i<names.length; i++){
            System.out.println("ID "+(i+1)+ " name is : "+names[i]);
        }
    }
}
