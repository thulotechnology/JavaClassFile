public class BankAccount {
    String name;
    double balance;

    BankAccount(){
        balance =0;
    }


    void deposit(double amount){
        balance+=amount;
    }

    void withDraw(double amount){
        if(balance> amount){
            balance-=amount;
        }else{
            System.out.println("Insufficient amount");
        }
    }

    void display(){
        System.out.println("Hello, "+this.name+ ", your total balance is "+balance);
    }
}
