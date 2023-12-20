package InterfaceWork;

public class Tesla implements Vehicle, Fly{

    @Override
    public void start() {
        System.out.println("Tesla started");
    }

    @Override
    public void stop() {
        System.out.println("Tesla stopped");
    }

    @Override
    public void fly() {
        System.out.println("Tesla Fly mode is activated...");
    }
}
