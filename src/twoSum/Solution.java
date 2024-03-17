package twoSum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            int difference = target - nums[i];

            if (map.containsKey(difference)) {
                return new int[] {map.get(difference), i};
            }
            map.put(nums[i], i);

            }
        return new int[0];

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Example 1:");
        System.out.println("Input: nums = [2, 7, 11, 15], target = 9");
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("\nExample 2:");
        System.out.println("Input: nums = [3, 2, 4], target = 6");
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("\nExample 3:");
        System.out.println("Input: nums = [3, 3], target = 6");
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
    }
}