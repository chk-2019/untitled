package Day54;

import java.util.Deque;
import java.util.LinkedList;

public class Calculate {
    public static void main(String[] args) {
//        Deque deque = new LinkedList();
//        deque.add(1);
//        deque.add(2);
//        deque.add(3);
//        System.out.println("peekFirst "+deque.pollFirst());
//        System.out.println("peekLast "+deque.pollLast());
//        System.out.println(deque);
//    }
        Solution solution  = new Solution();
        String s  = " 3+5 / 2 ";
        System.out.println(solution.calculate(s));
    }
}
class Solution {
    public int calculate(String s) {
        Deque deque = new LinkedList();
        String trim = s.replace(" ","");
        int num = 0;
        for (int i = 0; i < trim.length(); i++) {
            if (trim.charAt(i)>='0'&&trim.charAt(i)<='9'){
                num = num*10+Integer.valueOf(trim.charAt(i)-'0');
            }
            else{
                deque.add(num);
                num=0;
                deque.add(trim.charAt(i));
            }
        }
        deque.add(num);
        Deque deque1 = new LinkedList();
        while (!deque.isEmpty()){
            Object pop = deque.pop();
            if (pop instanceof Character){
                if ((Character) pop=='*'){
                    int last = (Integer) deque1.pollLast();
                    int next = (Integer) deque.pop();
                    deque1.add(last*next);
                }
                if ((Character) pop=='/'){
                    int last = (Integer) deque1.pollLast();
                    int next = (Integer) deque.pop();
                    deque1.add(last/next);
                }
                if ((Character) pop=='-')
                    deque1.add('-');
                if ((Character) pop=='+')
                    deque1.add('+');
            }
            else{
                deque1.add((Integer)pop);
            }

        }
        int res = 0;
        while (!deque1.isEmpty()){
            Object pop = deque1.pop();
            if (pop instanceof Character){
                if ((Character) pop=='+'){
                    res = res+(Integer) deque1.pop();
                }
                if ((Character) pop=='-'){
                    res = res-(Integer)deque1.pop();
                }
            }
            else{
                res+=(Integer) pop;
            }
        }
        return res;
    }
}
