
/*
 * Given an integer array nums,
 *  return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 */

import java.util.Scanner;

public class ContainsDuplicate
{
    public static int length;
    public static Scanner sc;
    public static int[] nums;
    public  static void main(String[] args)
    {
        System.out.println("Enter the number of elements: ");
        sc = new Scanner(System.in);
        length = sc.nextInt();

        nums = new int[length];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
    public static boolean containsDuplicate(int[] nums) {
        length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
