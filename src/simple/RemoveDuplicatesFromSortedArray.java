package simple;

/**
 * 26.删除排序数组中的重复项
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例 1:
 * <p>
 * 给定数组 nums = [1,1,2],
 * <p>
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * <p>
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        // 自己写的，以第一个元素为基准，让后面元素去比较value，如果大的话就把
        // 值写到index + 1对应的下标
/*        if(nums == null || nums.length == 0){
            return 0;
        }
        int index = 0;
        int value = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > value){
                value = nums[i];
                nums[index + 1] = value;
                index += 1;
            }
        }
        return index + 1;*/

        // 官方题解，与我的思路一致，但是写法比我更简洁，我的有些可以简化
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index += 1;
                nums[index] = nums[i];

            }
        }
        return index + 1;
    }
}
//