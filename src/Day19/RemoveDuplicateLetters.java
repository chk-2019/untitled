package Day19;

import java.util.*;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "cbacdcbc";
        String s1 = solution.removeDuplicateLetters(s);
        System.out.println(s1);

    }
}
class Solution {
    //错误思路
//    public String removeDuplicateLetters(String s) {
//        List<String> res = new ArrayList<>();
//
//        for (int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//            if (!res.contains(String.valueOf(c)))
//                res.add(String.valueOf(c));
//            continue;
//        }
//        Collections.sort(res);
//        String resString = String.valueOf(res);
//        return resString;
//    }
    public String removeDuplicateLetters(String s){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c=s.charAt(i);
            if(stack.contains(c))
                continue;
            while(!stack.isEmpty()&&stack.peek()>c&&s.indexOf(stack.peek(),i)!=-1)
                stack.pop();
            stack.push(c);
        }
        char chars[]=new char[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            chars[i]=stack.get(i);
        }
        return new String(chars);
    }
}
