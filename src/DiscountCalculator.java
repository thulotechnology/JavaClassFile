import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter purchase amount: ");
        double purchaseAmount = sc.nextDouble();
        double discount=0;

        if(purchaseAmount>=100){
            discount = purchaseAmount * 0.1; // 10% Discount
        }else{
            discount = 0;
        }

        double totalAmount = purchaseAmount - discount;
        System.out.println("You need to pay $"+totalAmount);
    }
}
