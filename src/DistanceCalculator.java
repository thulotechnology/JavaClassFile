public class DistanceCalculator {
    public static void main(String[] args) {
        // dpuble: It stores number with decimal point for. e.g 1.0, 2.5, -10.6
        double speedInMiles = 45.0;
        double totalDistance = 5;

        double totalTime = totalDistance/speedInMiles;
        double timeInMinutes = totalTime*60;
        System.out.println("Total Minutes it takes: "+timeInMinutes);

    }
}
