package org.leetcode.array;

import java.util.Arrays;

/**
 * Created by lightman_mac on 2018/7/10.
 * 给定一个数组 nums,编写一个函数将所有 0 移动到数组的末尾,同时保持非零元素的相对顺序.
 * <p>
 * 必须在原数组上操作,不能拷贝额外的数组.
 * 尽量减少操作次数
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 */
public class Q283 {

    public static void main(String[] fuck) {
        Q283 q283 = new Q283();
        int[] arr = {0, 1, 0, 3, 12, 0, 11, 0};

        System.out.println("origin " + Arrays.toString(arr));

//        q283.invertMove(arr);
        q283.moveZeroes(arr);

        System.out.println("after " + Arrays.toString(arr));
    }


    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int insertPos = 0;
        //先把非0的都放在前面
        //这样剩下的都弄成0就行了
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos++] = nums[i];
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }


    private void invertMove(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int pos = nums.length - 1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != 0) {
                nums[pos--] = nums[i];
            }
        }

        while (pos > 0) {
            nums[pos--] = 0;
        }
    }
}
