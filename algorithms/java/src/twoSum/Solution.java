package twoSum;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
 * target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 * <b>Example 1:</b>
 * <br>
 * Input: nums = [2, 7, 11, 15], target = 9
 * <br>
 * Output: [0, 1]
 * <br>
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * <p>
 * <b>Example 2:</b>
 * <br>
 * Input: nums = [3, 2, 4], target = 6
 * <br>
 * Output: [1, 2]
 *
 * <p>
 * <b>Example 3:</b>
 * <br>
 * Input: nums = [3, 3], target = 6
 * <br>
 * Output: [0, 1]
 */
public class Solution {

    public static void main(String[] args) {
        // Set up example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] solution1 = twoSum(nums1, target1);

        // Set up example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] solution2 = twoSum(nums2, target2);

        // Set up example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] solution3 = twoSum(nums3, target3);

        System.out.println(Arrays.toString(solution1));
        System.out.println(Arrays.toString(solution2));
        System.out.println(Arrays.toString(solution3));
    }

    public static int[] twoSum(int[] nums, int target) {
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            start = nums[i];

            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    break;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[]{j, i};
                }
            }
        }

        return null;
    }
}
