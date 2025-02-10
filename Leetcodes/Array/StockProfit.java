/**
 * Problem Statement:
You are given an integer array prices where prices[i] represents the price of a stock on the i-th day.

Your task is to maximize your profit by choosing:

A single day to buy a stock.
A later day to sell that stock.
The goal is to find the maximum possible profit from this transaction.

If no profit can be made (i.e., prices are continuously decreasing), return 0.

Example 1:
Input:
java
Copy
Edit
prices = [7, 1, 5, 3, 6, 4]
Output:
java
Copy
Edit
5
Explanation:
Buy on day 2 (price = 1).
Sell on day 5 (price = 6).
Profit = 6 - 1 = 5 (maximum possible).
Example 2:
Input:
java
Copy
Edit
prices = [7, 6, 4, 3, 1]
Output:
java
Copy
Edit
0
Explanation:
No profitable transaction is possible.
Prices keep decreasing, so return 0.
Constraints:
1 <= prices.length <= 10^5
0 <= prices[i] <= 10^4
 */




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
