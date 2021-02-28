package Day50;

import java.util.Stack;

public class MinRemoveToMakeValid {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minRemoveToMakeValid("(a(b(c)d)"));
    }
}
class Solution {
    public String minRemoveToMakeValid(String s) {
        int len = s.length();
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i)=='('){
                int temp[] = {i,0};
                stack.push(temp);
                continue;
            }
            if (s.charAt(i)==')') {
                if (!stack.isEmpty()) {
                    int[] peek = stack.peek();
                    if (peek[1] == 0) {
                        stack.pop();
                        continue;
                    }
                }
                int temp[] = {i, 1};
                stack.push(temp);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        while(!stack.isEmpty()){
            int index = stack.pop()[0];
            stringBuilder.deleteCharAt(index);
        }
        return stringBuilder.toString();
    }
}