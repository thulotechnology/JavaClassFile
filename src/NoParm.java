import java.util.Scanner;

public class NoParm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age>voterAge()){
            System.out.println("You can vote.");
        }else{
            System.out.println("You can't vote.");
        }
    }
    // No Parm but Return
    public static int voterAge(){
        return 17;
    }
}
