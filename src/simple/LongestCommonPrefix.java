package simple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 14.最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"caa", "ca", "caaaa", "c"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        /*if(strs == null || strs.length == 0){
            return "";
        }

        int ind = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[ind].length() > strs[i].length()) {
                ind = i;
            }
        }
        String basic = strs[ind];
        String first = strs[0];
        String rs = "";
        int flag = 0;
        for (int i = 1; i <= basic.length(); i++) {
            String sss = first.substring(0,i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].indexOf(sss) != 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                rs = sss;
            }
        }


        return rs;*/
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
        //return Arrays.stream(strs).sorted(Comparator.comparing(String::length)).collect(Collectors.toList()).get(0);

    }
}
