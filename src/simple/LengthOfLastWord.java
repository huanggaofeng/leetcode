package simple;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" a"));
    }

    public static int lengthOfLastWord(String s) {
        // 第一反应就是用spilt
        /*String[] ss = s.split(" ");
        if(ss.length == 0){
            return 0;
        }
        return ss[ss.length-1].length();*/
        // 把字符串去除前后空格，然后找到最后一个空格
        /*s = s.trim();
        if(s.length() == 0){
            return 0;
        }

        return s.length()-1 -  s.lastIndexOf(" ");*/
        // 循环查找字符串尾部是否有空字符串，记录下不是空格的下标
        int e = s.length() - 1;
        while (e >= 0 && s.charAt(e) == ' ') {
            e--;
        }
        if (e < 0) {
            return 0;
        }
        // 从下标开始一直往前查找字符串，直到查找到一个空格停下
        // 完整过程为先从后过滤掉空格找到单词尾部，再从尾部向前遍历，找到单词头部，最后两者相减，即为单词的长度
        int i = e;
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
        }
        return e - i;
    }
}
