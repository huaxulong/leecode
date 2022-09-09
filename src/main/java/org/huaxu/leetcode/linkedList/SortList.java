package org.huaxu.leetcode.linkedList;

import org.huaxu.common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author DongxuHua
 * @Date: 2022/9/7 3:03 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.sort， 这种主要是 list排序 时间复杂度 O(N^2) 空间复杂度：O(N)
 */
public class SortList {

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }

        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        Collections.sort(list);

        ListNode node = new ListNode(1000);

        sort(node, list);

        return node.next;

    }

    public void sort(ListNode node, List<Integer> list) {
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                node.next = new ListNode(list.get(i));
                node = node.next;
            }
        }
    }


    public static void main(String[] args) {
        // [4,2,1,3]
        /*ListNode listNode4 = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode3;
        listNode2.next = listNode1;
        listNode4.next = listNode2;*/
//        printListNode(listNode4);
//        ---------------------------------------

        // [-1,5,3,4,0]
        ListNode listNode_1 = new ListNode(-1);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode0 = new ListNode(0);

        listNode_1.next = listNode5;
        listNode5.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode0;


        SortList sortList = new SortList();
        ListNode listNode = sortList.sortList(listNode_1);

        printListNode(listNode);





    }

    public static void printListNode(ListNode head) {
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

}
