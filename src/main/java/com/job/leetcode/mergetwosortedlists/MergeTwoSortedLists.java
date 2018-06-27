package com.job.leetcode.mergetwosortedlists;

import java.util.Objects;

/**
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/description/
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode listNodeTemp = listNode;
        do {
            if (Objects.isNull(l1)) {
                listNode.next = l2;
                break;
            }
            if (Objects.isNull(l2)) {
                listNode.next = l1;
                break;
            }
            if (l2.val > l1.val) {
                listNode.next = l1;
                l1 = l1.next;
            } else {
                listNode.next = l2;
                l2 = l2.next;
            }
            listNode = listNode.next;
        } while (true);
        return listNodeTemp.next;
    }
}
