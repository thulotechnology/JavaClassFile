public class LaptopWork {
    public static void main(String[] args) {
        //Here l1 and l2 are objects
        Laptop l1 = new Laptop();
        l1.name = "Lenevo";
        l1.price =2500;
        l1.display();

    }
}
 class Laptop {
    // Properties
    String name;
    double price;
    void display(){
        System.out.println("Laptop name is "+this.name);
        System.out.println("Laptop price is "+this.price);
        System.out.println("----------------");
    }
}