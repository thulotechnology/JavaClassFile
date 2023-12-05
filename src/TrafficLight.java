import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Traffic Light Name [Green, Red, Yellow]");
        String trafficLight = sc.nextLine().toUpperCase();

        if(trafficLight.equals("RED")){
            System.out.println("Stop");
        }else if(trafficLight.equals("YELLOW")){
            System.out.println("Prepare to stop");
        }else if(trafficLight.equals("GREEN")){
            System.out.println("Go");
        }else{
            System.out.println("Invalid traffic light signal.");
        }

    }
}
