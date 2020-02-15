package simple;

public class Sqrtx {

    public static void main(String[] args) {
        System.out.println(mySqrt(1));
    }

    public static int mySqrt(int x) {
        // 看见这题第一反应，哈哈哈哈
        // return (int)Math.sqrt(x);
        // 二分法，一个数的的平方根是会<=它的一半
        long left = 0L;
        // 为了满足，0，1所以加一
        long right = x / 2 + 1;
        while (left < right) {
            // 中间值要右中间值，左中间值有些情况会无限循环，比如13
            long mid = (left + right) / 2 + 1;
            if (mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int) left;
    }
}
