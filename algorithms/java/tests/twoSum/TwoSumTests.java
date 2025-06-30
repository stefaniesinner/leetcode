package twoSum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Tests for the implementation of the {@link Solution} class.
 */
public class TwoSumTests {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = sol.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] actual = sol.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] actual = sol.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}

