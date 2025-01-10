package hw9jan;
import java.util.Scanner;

public class distanceBetween {


    public static double distanceBetweenPoints(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number (x1): ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the second number (y1): ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the third number (x2): ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the fourth number (y2): ");
        double y2 = sc.nextDouble();
        double distance = distanceBetweenPoints(x1, y1, x2, y2);
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
    }
}
