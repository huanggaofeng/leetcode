package simple;

/**
 * 27.移除元素
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums, 2));
    }

    // 和第26题相当类似
    // 将num[i] != val时就将num[i]的值给num[index]，且index值加一
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
