package leetcode;

import java.util.Stack;

/**
 * @Author :huayanjun
 * @Data: 2019/9/4 9:23
 * leetcode:71
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] sp = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String s : sp) {
            if (s.isEmpty() || s.equals("."))
                continue;
            if (s.equals("..")) {
                if (!stack.empty())
                    stack.pop();
            } else {
                stack.push(s);
            }
        }
        if (stack.empty())
            return "/";
        String res = "";
        for (String st : stack) {
            res += "/" + st;
        }
        return res;
    }
}
