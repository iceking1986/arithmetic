package com.wangb.arith.list.swappairs;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-06 11:47:31
 */
public class SwapPairs24_3 {
    public ListNode swapPairs(ListNode head) {

        ListNode preNode = new ListNode(0);
        preNode.next = head;
        ListNode tmpNode = preNode;

        while (tmpNode != null && tmpNode.next != null && tmpNode.next.next != null) {
            ListNode swap1Node = tmpNode.next;
            ListNode swap2Node = tmpNode.next.next;

            tmpNode.next = swap2Node;
            swap1Node.next = swap2Node.next;
            swap2Node.next = swap1Node;

            tmpNode = swap1Node;

        }

        return preNode.next;
    }

    @Test
    public void testSwapPairs() {
        System.out.println("----------------testSwapPairs---------------");
        ListNode node = new ListNode(1);
        ListNode tail = node;
        for (int i = 2; i < 10; i++) {
            ListNode tmpNextNode = new ListNode(i);
            tail.next = tmpNextNode;
            tail = tmpNextNode;
        }

        ListNode tempNode = node;
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }

        tempNode = swapPairs(node);
        System.out.println();
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }
    }
}
