public class MyNewWork {
    public static void main(String[] args) {
    ChristmasLight cl = new ChristmasLight();
    cl.on();
    }
}

class Light{

    void on(){
        System.out.println("Light is on");
    }
}

class ChristmasLight extends Light{
    @Override
    void on(){
        super.on();
        System.out.println("Christmas Light on");
    }
}


