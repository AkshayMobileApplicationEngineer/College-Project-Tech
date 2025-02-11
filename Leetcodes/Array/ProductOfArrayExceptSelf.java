import java.util.Scanner;

/**
 *
 * link of the problem : https://leetcode.com/problems/product-of-array-except-self/description/
 *
 *
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 *
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */


public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];

        // Step 1: Compute left products
        answer[0] = 1;
        for (int i = 1; i < length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: Compute right products and multiply with left products
        int rightProduct = 1;
        for (int i = length - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the size of array:");
        int length = sc.nextInt();
        int[] array = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        // Compute result
        int[] result = productExceptSelf(array);

        // Print output
        System.out.print("The product array is: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}