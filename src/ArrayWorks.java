import java.util.Scanner;
// Store 5 names and display using user input
public class ArrayWorks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruits = {"","",""};

        // Fruits Input
        for(int i=0; i< fruits.length; i++){
            System.out.println("Enter fruits no: "+(i+1) + ":" );
            fruits[i] = sc.nextLine();
        }
        // Fruits Output
        System.out.println("All fruits are: ");
        for(int i=0; i< fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }
}
