public class BankWork {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.name = "Shashi";

        BankAccount b2 = new BankAccount();
        b2.name = "Istar";

        BankAccount b3 = new BankAccount();
        b3.name = "Ganesh";


        b1.deposit(250);
        b2.deposit(500);

        b3.deposit(1000);

        b2.withDraw(250);

        b1.display();
        b2.display();
        b3.display();


    }
}
