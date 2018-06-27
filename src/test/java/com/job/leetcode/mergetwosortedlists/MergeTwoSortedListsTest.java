package com.job.leetcode.mergetwosortedlists;

import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    @Test
    public void test() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        b1.next = b2;
        b2.next = b3;
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(a1, b1);
        Assert.assertEquals(1, listNode.val);
        Assert.assertEquals(1, listNode.next.val);
        Assert.assertEquals(2, listNode.next.next.val);
        Assert.assertEquals(3, listNode.next.next.next.val);
        Assert.assertEquals(4, listNode.next.next.next.next.val);
        Assert.assertEquals(4, listNode.next.next.next.next.next.val);
    }
}
