public class CameraWork {
    public static void main(String[] args) {
//        Creating Object of Camera
        Camera c = new Camera("Sony", 2000);
        c.setName("Canon");
        c.display();


    }
}

class Camera{
    private String name;
    private double price;

    public Camera(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void setName(String n){
        this.name = n;
    }

    void display(){
        System.out.println("Name is "+name);
        System.out.println("Price is "+price);
    }
}
