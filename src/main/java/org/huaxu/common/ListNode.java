package org.huaxu.common;

/**
 * @Author DongxuHua
 * @Date: 2022/9/7 3:16 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.common
 */
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode() {

    }

    public ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
