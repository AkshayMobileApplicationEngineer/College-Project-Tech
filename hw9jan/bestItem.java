package hw9jan;
import java.util.Scanner;

public class bestItem {
    public static String[] sallers = new String[3];
    public static double[] prices = new double[3];
    public static double[] discounts = new double[3];
    public static double[] finalPrices = new double[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data for three sellers
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name of the seller: ");
            sallers[i] = sc.next();
            System.out.println("Enter the price of the item: ");
            prices[i] = sc.nextDouble();
            System.out.println("Enter the discount of the item: ");
            discounts[i] = sc.nextDouble();


           System.out.println("");
        
            finalPrices[i] = prices[i] - (prices[i] * discounts[i] / 100);
        }

        int bestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (finalPrices[i] < finalPrices[bestIndex]) {
                bestIndex = i;
            }
        }

        System.out.println("The best item is from " + sallers[bestIndex] + 
                           " with a final price of " + finalPrices[bestIndex]);

        sc.close();
    }
}
