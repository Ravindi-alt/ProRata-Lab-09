
import java.util.Scanner;

public class IT23208544Lab9Q2 {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        System.out.println("Area of the circle: " + circleArea(radius));

        input.close();
    }
}
