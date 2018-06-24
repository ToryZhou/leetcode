package com.job.leetcode.intersectionoftwolinkedlists;

import java.util.HashSet;
import java.util.Objects;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/description/
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> listNodeHashSet = new HashSet<>();
        int size = 0;
        while (Objects.nonNull(headA)) {
            listNodeHashSet.add(headA);
            headA = headA.next;
        }
        while (Objects.nonNull(headB)) {
            size = listNodeHashSet.size();
            listNodeHashSet.add(headB);
            if (size == listNodeHashSet.size()) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    public ListNode getIntersectionNodeTwoLoop(ListNode headA, ListNode headB) {
        ListNode headBTemp = headB;
        while (Objects.nonNull(headA)) {
            while (Objects.nonNull(headB)) {
                if (headA == headB) {
                    return headA;
                }
                headB = headB.next;
            }
            headB = headBTemp;
            headA = headA.next;
        }
        return null;
    }

}
