package Day71;

public class LongestSubstring {
    public static void main(String[] args) {
        //System.out.println(String.valueOf((char)(1+'a')));
        Solution2 solution2 = new Solution2();
        int sout = solution2.longestSubstring("bbaaacbd", 3);
        System.out.println(sout);
    }
}
class Solution2 {
    public int longestSubstring(String s, int k) {
        int letterCount[] = new int[27];
        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i)-'a']++;
        }
        if (s.length()<k)
            return 0;
        for (int i = 0; i < s.length(); i++) {
            if (letterCount[s.charAt(i)-'a']<k){
                String[] split = s.split(String.valueOf(s.charAt(i)));
                int max = 0;
                for (int j = 0; j < split.length; j++) {
                    max = Math.max(max,longestSubstring(split[j],k));
                }
                return max;
            }
            if (i==s.length()-1&&letterCount[s.charAt(i)-'a']>=k){
                return s.length();
            }
        }
        return 0;
    }
}