package simple;

/**
 * 38.外观数列
 */
public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(6));
    }

    public static String countAndSay(int n) {
        // 把字符串每个元素都遍历，然后记录一个元素的值c,和在下一个不同的元素值出现的次数k
        // 剩下的就是循环拼接字符串了
        if (n == 1) {
            return "1";
        }
        String s = "1";
        String ss = "";
        for (int i = 1; i < n; i++) {
            char c = s.charAt(0);
            int k = 1;
            for (int j = 1; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    k++;
                } else {
                    ss = ss + k + c;
                    c = s.charAt(j);
                    k = 1;
                }
            }
            s = ss + k + c;
            ss = "";
        }
        return s;
    }
}
