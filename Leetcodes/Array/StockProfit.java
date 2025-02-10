import java.util.Scanner;

public class StockProfit {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE; // Minimum price so far
        int maxProfit = 0; // Maximum profit

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the minimum price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Calculate profit
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();

        int[] prices = new int[days];
        System.out.println("Enter the stock prices:");
        for (int i = 0; i < days; i++) {
            prices[i] = sc.nextInt();
        }

        // Compute maximum profit
        int result = maxProfit(prices);
        System.out.println("Maximum profit: " + result);

        sc.close();
    }
}
