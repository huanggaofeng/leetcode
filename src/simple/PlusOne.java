package simple;

import java.util.Arrays;

/**
 * 66.加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = new int[]{0};

        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        // 第一反应就是把数组转成字符串然后在变成数字加一，如果数组过长会报错
        /*String s = "";
        for (int i = 0; i < digits.length; i++) {
            s += digits[i];
        }
        s = (Integer.parseInt(s) + 1) + "";
        int[] ii = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {

            ii[i] = Integer.parseInt(s.substring(i, i + 1));
        }
        return ii;*/
        // 从最后元素循环加一，如果是9则设为0，循环继续
        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        // 如果第一个元素是0，意味着整个数组已经都是0，所以要在前面插入1
        if (digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}
