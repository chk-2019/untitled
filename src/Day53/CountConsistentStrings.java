package Day53;

import java.util.HashSet;
import java.util.Set;

public class CountConsistentStrings {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String allowed = "cad";
        String words[] = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(solution.countConsistentStrings(allowed,words));
    }
}
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        int count = 0;
        for(String temp:words){
            int len = temp.length();
            for (int i = 0; i < len; i++) {
                if (!set.contains(temp.charAt(i)))
                    break;
                if (i==len-1&&set.contains(temp.charAt(i)))
                    count++;
            }
        }
        return count;
    }
}