package Day70;

public class LongestSubstring {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int sout = solution.longestSubstring("ababacb", 3);
        System.out.println(sout);
    }
}
class Solution {
    public int longestSubstring(String s, int k) {
        int res = 0;
        int letterCount[] = new int[27];
        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i)-'a']++;
        }
        int letterCountByNow[] = new int[27];
        int left = 0,right = 0;
        while(right<s.length()){
            char temp = s.charAt(right);
            letterCountByNow[s.charAt(right)-'a']++;
            if (letterCount[temp-'a']<k){

            }
            right++;
        }
        return res;
    }
}