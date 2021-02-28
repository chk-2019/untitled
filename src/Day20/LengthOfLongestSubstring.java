package Day20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
//        List<Character> s1 = new ArrayList<>();
//        System.out.println(s1.contains('1'));
        Solution2 solution2 = new Solution2();
        String s = "pwwkew";
        int len = solution2.lengthOfLongestSubstring2(s);
        System.out.println("============");
        System.out.println(len);
    }
}
class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if (null==s||s.length()==0)
            return 0;
        List<Character> s1 = new ArrayList<>();
        int max=1;
        int index=0;
        int index1=0;
        while (index<=s.length()-1&&index1<s.length()-max){
            char temp = s.charAt(index);
            if (!s1.contains(temp)){
                s1.add(temp);
                index++;
                continue;
            }
            else{
                if (s1.size()>max)
                    max=s1.size();
                s1.clear();
                index1++;
                index=index1;
            }
        }
        if (s1.size()>max)
            max=s1.size();
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int max = 0;
        for (int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if (!map.containsKey(temp)){
                map.put(temp,i);
                max=Math.max(max,end-start+1);
                end++;
            }
            else {
                start=Math.max(start,map.get(temp)+1);
                max=Math.max(max,end-start+1);
                map.put(temp,i);
                end++;
            }

        }
        return max;
    }

}