package simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20.有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 */
public class ValidParentheses {

    public static void main(String[] args) {
        String s = "(()())()({[]})";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        // 通过栈，字符串遇到( { [ 入栈，）} ] 出栈
        if ("".equals(s)) {
            return true;
        }
        int l = s.length();
        // 如果求模余数等于1，意味着有落单的
        if (l == 0 || l % 2 == 1) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>(16);
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        if (map.containsKey(s.charAt(0))) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                Character c1 = st.pop();
                if (c1 != map.get(c)) {
                    return false;
                }
            } else {
                st.push(c);
            }
        }
        if (st.empty()) {
            return true;
        } else {
            return false;
        }
    }


}
