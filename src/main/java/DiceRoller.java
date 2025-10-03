import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        // TODO: Create Random objects for dice rolling
        // 1. Three Random objects without seeds (unseeded dice)
        // 2. One Random object with any seed value (seeded die)
        int unseeded1, unseeded2, unseeded3, seeded;

        // TODO: Generate random integers for dice rolls
        unseeded1 =  (int) (Math.random()* 6) + 1;
        unseeded2 =  (int) (Math.random()* 6) + 1;
        unseeded3 =  (int) (Math.random()* 6) + 1;
        Random randomSeed = new Random(60);
        seeded = randomSeed.nextInt(6);

        // TODO: Display the dice rolls - 1-6
        // Show all four dice rolls with clear labels
        System.out.println("Unseeded Die 1: " + unseeded1);
        System.out.println("Unseeded Die 2: " + unseeded2);
        System.out.println("Unseeded Die 3: " + unseeded3);
        System.out.println("Seeded Die: " + seeded);

        // TODO: Demonstrate the difference between seeded and unseeded
        // Run the program multiple times to show seeded consistency
    }
}
