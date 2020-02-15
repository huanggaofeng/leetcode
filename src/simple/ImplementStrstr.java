package simple;

/**
 * 28.实现strStr()
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 */
public class ImplementStrstr {
    public static void main(String[] args) {
        String haystack = "aaaacaaaass";
        String needle = "aass";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        // 这题第一反应就是indexOf
        /*
        return haystack.indexOf(needle);*/
        // 暴力匹配，将needle逐个字符与haystack匹配，一旦有不匹配的，重新走一遍，直到完全匹配
       /* int hl = haystack.length();
        int nl = needle.length();
        for (int i = 0; i <= hl - nl; i++) {
            int j;
            for (j = 0; j < nl ; j++) {
                if(needle.charAt(j) != haystack.charAt(i + j)){

                    break;
                }
            }
            if(j == nl){
                return i;
            }
        }*/
        // kmp算法,暂时没看懂
        return -1;
    }
}
