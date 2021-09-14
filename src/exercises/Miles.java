package exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("How much gas have you consumed (in gallons?)");
        double gas = input.nextDouble();

        double milesPerGallon = miles / gas;
        System.out.println("Your miles-per-gallon is: " + milesPerGallon);
    }
}
