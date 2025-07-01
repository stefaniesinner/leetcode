package addTwoNumbers;

import java.util.ArrayList;
import java.util.Collections;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * <b>Constraints:</b>
 * <ul>
 *     <li>The number of nodes in each linked list is in the range <code>[1, 100]</code></li>
 *     <li><code>0 <= Node.val <= 9</code></li>
 *     <li>It is guaranteed that the list represents a number that does not have leading zeros</li>
 * </ul>
 *
 * <p>
 * <b>Example 1:</b>
 * <br>
 * Input: l1 = [2, 4, 3], l2 = [5, 6, 4]
 * <br>
 * Output: [7, 0, 8]
 * <br>
 * Explanation: 342 + 465 = 807
 *
 * <p>
 * <b>Example 2:</b>
 * <br>
 * Input: l1 = [0], l2 = [0]
 * <br>
 * Output: [0]
 *
 * <p>
 * <b>Example 3:</b>
 * <br>
 * Input: l1 = [9, 9, 9, 9, 9, 9, 9], l2 = [9, 9, 9, 9]
 * <br>
 * Output: [8, 9, 9, 9, 0, 0, 0, 1]
 */
public class Solution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);

        ListNode l2 = new ListNode(0);

        ListNode result = new Solution().addTwoNumbers(l1, l2);
        System.out.println(result);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = reverseList(l1);
        int num1 = listToInt(list1);

        ArrayList<Integer> list2 = reverseList(l2);
        int num2 = listToInt(list2);

        int sum = num1 + num2;

        ListNode result = null;
        ListNode current = null;

        if (sum == 0) {
            result = new ListNode(0);
        }

        while (sum > 0) {
            int num = sum % 10;

            if (result == null) {
                // first node
                result = new ListNode(num);
                current = result;
            } else {
                // other nodes
                current.next = new ListNode(num);
                current = current.next;
            }
            sum = sum / 10;
        }

        return result;
    }

    private ArrayList<Integer> reverseList(ListNode list) {
        ArrayList<Integer> result = new ArrayList<>();

        while (list != null) {
            result.add(list.val);
            list = list.next;
        }

        Collections.reverse(result);
        return result;
    }

    private int listToInt(ArrayList<Integer> list) {
        int result = 0;

        for (int i = 0; i < list.size(); i++) {
            result = result * 10 + list.get(i);
        }

        return result;
    }
}
