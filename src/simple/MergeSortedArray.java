package simple;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] nums1 = new int[m + n];
        nums1[0] = 0;
        nums1[1] = 1;
        nums1[2] = 2;
        int[] nums2 = new int[]{0, 1, 4};
        merge(nums1, m, nums2, n);
        System.out.println(nums1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 第一反应就是把两个数组合并在排序
        // 精简版
        // System.arraycopy(nums2, 0, nums1, m, n);
        // Arrays.sort(nums1);
        // 自己实现
        /*int k = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[k];
            k++;
        }
        for (int i = 0; i < m + n; i++) {
            for (int j = 0; j < m + n - 1; j++) {
                if(nums1[j] > nums1[j + 1]){
                    int s = nums1[j+1];
                    nums1[j+1] = nums1[j];
                    nums1[j] = s;
                }
            }
        }*/
        // 题解,从后向前数组遍历
        //因为 nums1 的空间都集中在后面，所以从后向前处理排序的数据会更好，节省空间，一边遍历一边将值填充进去
        //设置指针 len1 和 len2 分别指向 nums1 和 nums2 的有数字尾部，从尾部值开始比较遍历，同时设置指针 len 指向 nums1 的最末尾，每次遍历比较值大小之后，则进行填充
        //当 len1<0 时遍历结束，此时 nums2 中还有数据未拷贝完全，将其直接拷贝到 nums1 的前面，最后得到结果数组
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;
        while (len1 >= 0 && len2 >= 0) {
            if (nums1[len1] > nums2[len2]) {
                nums1[len] = nums1[len1];
                len1--;
            } else {
                nums1[len] = nums2[len2];
                len2--;
            }
            len--;
        }
        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为len2+1
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
    }
}
