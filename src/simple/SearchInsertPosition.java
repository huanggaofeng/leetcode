package simple;

import java.util.Arrays;

/**
 * 35.搜索插入位置
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(searchInsert(nums, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        // 没考虑数组有负数
        /*if(nums == null || nums.length == 0){
            return -1;
        }
        int index;
        if (target > nums.length) {
            index = nums.length - 1;
        } else {
            index = target - 1;
        }
        int i;
        for (i = index; i >= 0; i--) {
            if (nums[i] == target) {
                return i;
            }
            if (target > nums[i]) {
                return i + 1;
            }
        }*/
        // 这个题一想到就是二分法
        // 左边界
        int left = 0;
        // 右边界
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                // 当前中间值比值大的话，右边界变成中间下标-1
                right = mid - 1;
            } else if (nums[mid] < target) {
                // 当前中间值比值小的话，左边界变成中间下标+1
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return left;
    }
}
