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
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = new Solution().addTwoNumbers(l1, l2);
        System.out.println(result);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = new ArrayList<>();

        while (l1 != null) {
            System.out.println(l1.val);
            list1.add(l1.val);
            l1 = l1.next;
        }

        Collections.reverse(list1);
        System.out.println(list1);

        return l1;
    }
}
