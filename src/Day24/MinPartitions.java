package Day24;

import java.util.Arrays;

public class MinPartitions {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.minPartitions("32"));
    }
}
class Solution2 {
    public int minPartitions(String n) {
        char[] ch = n.toCharArray();
        Arrays.sort(ch);
        return Integer.valueOf(String.valueOf(ch[ch.length-1]));
    }
}

