package org.huaxu.leetcode.sort;

/**
 * @Author DongxuHua
 * @Date: 2022/9/29 5:26 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.leetcode.sort
 */
public class RemoveElement {

    // 双指针法
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length;

        while (left < right){
            if (nums[left] == val){
                nums[left] = nums[right - 1];
                right --;
            }else {
                left ++;
            }
        }
        return left;
    }


}
