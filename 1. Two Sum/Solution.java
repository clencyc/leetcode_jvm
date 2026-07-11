import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> twosum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (twosum.containsKey(complement)) {
                return new int[]{twosum.get(complement), i};
            }
            twosum.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] result1 = sol.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Test 1: " + java.util.Arrays.toString(result1) + " (expected [0, 1])");

        int[] result2 = sol.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Test 2: " + java.util.Arrays.toString(result2) + " (expected [1, 2])");

        int[] result3 = sol.twoSum(new int[]{3, 3}, 6);
        System.out.println("Test 3: " + java.util.Arrays.toString(result3) + " (expected [0, 1])");
    }
}