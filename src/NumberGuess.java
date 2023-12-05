import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randomNumber = (int)Math.floor(Math.random()*6)+1;
        System.out.println("Guess the number: ");
        int userInput = sc.nextInt();

        if(randomNumber == userInput){
            System.out.println("Congratulations you guess the correct number");
        }else{
            System.out.println("Sorry, lucky number is "+randomNumber);
        }
    }
}
