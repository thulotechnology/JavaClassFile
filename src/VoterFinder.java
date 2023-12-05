import java.util.Scanner;

public class VoterFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are voter.");
        }else{
           int remaining = 18 - age;
            System.out.println("You can vote after "+remaining + " years.");
        }
    }
}
// Write a Program that print "Budget is high if price is equal or more than 500. Otherwise print budget is okay"
// Enter Price: ...
// if(price>5)