public class twoSum {
    public int[] twoSumIndex(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        twoSum ts = new twoSum();
        int[] res = ts.twoSumIndex(nums, target);
        
        // Format the output to [index1, index2]
        System.out.println("Output: [" + res[0] + "," + res[1] + "]");
    }
}
