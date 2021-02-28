package Day56;

public class CharacterReplacement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.characterReplacement("ABBB",2));
    }
}
class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        int left = 0;
        int right = 0;
        int temp = k;
        int res = 0;
        int ZM[] = new int[27];
        int hisMax = 0;
        while(right<len){
            hisMax = Math.max(hisMax,++ZM[s.charAt(right)-'A']);
            if (hisMax+k>right-left) {
                res = Math.max(right - left+1, res);
                right++;
                continue;
            }
            else{
                ZM[s.charAt(left++)-'A']--;
                right++;
            }
        }

        return res;
    }
}