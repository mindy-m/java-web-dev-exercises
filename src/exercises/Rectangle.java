package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.println("Thank you.  Please enter the width of the rectangle: ");
        double width = input.nextDouble();

        double areaOfRectangle = length * width;
        System.out.println("The area of the rectangle you entered is: " + areaOfRectangle);
    }
}
