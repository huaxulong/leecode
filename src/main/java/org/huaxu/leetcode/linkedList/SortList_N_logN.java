package org.huaxu.leetcode.linkedList;

import org.apache.commons.lang3.StringUtils;
import org.huaxu.common.ListNode;

/**
 * @Author DongxuHua
 * @Date: 2022/9/9 3:07 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.leetcode.linkedList
 * 进阶要求 ： O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？
 * 要求: 时间复杂度:O(n logN ) 、 空间复杂度： O(1).
 * 时间复杂度是 O(nlogN) 的排序算法包括 归并排序 、 堆排序 、 快速排序(最差时间复杂度是 O(N^2) )。
 */
public class SortList_N_logN {

    public static ListNode sortList(ListNode head) {
        return sortList(head, null);
    }

    public static ListNode sortList(ListNode head, ListNode tail) {
        if (head == null) {
            return head;
        }

        ListNode slow = head, fast = head;
        while (fast != tail) {
            slow = slow.next;
            if (fast.next == tail || fast.next.next == tail) {
                break;
            } else {
                fast = fast.next.next;
            }
        }

        ListNode mid = slow;
        ListNode list1 = sortList(head, mid);
        ListNode list2 = sortList(mid, tail);
        ListNode merge = merge(list1, list2);


        return merge;
    }


    public static ListNode merge(ListNode leftNode, ListNode rightNode) {
        ListNode head = new ListNode(0);
        ListNode dummyHead = head;
        while (leftNode != null && rightNode != null) {
            if (leftNode.val < rightNode.val) {
                dummyHead.next = new ListNode(leftNode.val);
                leftNode = leftNode.next;
            } else {
                dummyHead.next = new ListNode(rightNode.val);
                rightNode = rightNode.next;
            }
            dummyHead = dummyHead.next;
        }

        // 剩下的是左边的没有分配完
        while (leftNode != null) {
            dummyHead.next = new ListNode(leftNode.val);
            leftNode = leftNode.next;
            dummyHead = dummyHead.next;
        }

        // 剩下的是右边的没有分配完
        while (rightNode != null) {
            dummyHead.next = new ListNode(rightNode.val);
            rightNode = rightNode.next;
            dummyHead = dummyHead.next;
        }

        return head.next;
    }

    public static void main(String[] args) {
        // [4,2,1,3]

        // [-1,5,3,4,0]

        /*String str = "[-1, 2, 3, 4]";
        ListNode listNode = strToListNode(str);

        String str2 = "[1,6]";
        ListNode listNode2 = strToListNode(str2);


        printListNode(listNode);
        printListNode(listNode2);

        ListNode merge = merge(listNode, listNode2);*/

        String str = "[-1,5,3,4,9,1,3,2,6,6]";
        ListNode listNode = strToListNode(str);
        printListNode(listNode);

        ListNode sortList = sortList(listNode);

        printListNode(sortList);


    }

    /**
     * @param str 格式为 [1,2,3,4]
     * @return
     */
    public static ListNode strToListNode(String str) {
        ListNode dummyHead = new ListNode(0);

        ListNode temp = dummyHead;
        String newStr = str.substring(1, str.length() - 1);
        String[] split = newStr.split(",");
        if (split != null) {
            for (int i = 0; i < split.length; i++) {
                if (StringUtils.isNotEmpty(split[i])) {
                    temp.next = new ListNode(Integer.valueOf(split[i].replaceAll(" ", "")));
                    temp = temp.next;
                }
            }
        }
        return dummyHead.next;
    }

    public static void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "  ->" + "\t");
            head = head.next;
        }
        System.out.println();
    }


}
