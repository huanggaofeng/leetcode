package simple;

/**
 * 7.整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class IntReverse {
    public static void main(String[] args) {
        System.out.println(reverse(90100));
    }

    public static int reverse(int x) {
        // 自己想的，效率较差
        /*String xs = x + "";
        String[] ss;
        String rs = "";
        if(xs.indexOf("-") == 0){
            ss = xs.substring(1).split("");
            rs = "-";
        }else {
            ss = xs.split("");
        }
        for (int i = ss.length-1; i >= 0; i--) {
            rs += ss[i];
        }
        try {
            x = Integer.valueOf(rs);
        }catch (Exception e){
            return 0;
        }
        return x;*/
        // 官方方法
        int r = 0;
        while (x != 0) {
            int pop = x % 10;
            if (r > Integer.MAX_VALUE / 10 || (Integer.MAX_VALUE / 10 == r && pop > 7)) {
                return 0;
            }
            if (r < Integer.MIN_VALUE / 10 || (Integer.MIN_VALUE / 10 == r && pop < -8)) {
                return 0;
            }
            r = r * 10 + pop;
            x /= 10;
        }
        return r;
    }
}
