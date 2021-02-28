package Day21;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.isIsomorphic("aa","ab"));
    }
}
class Solution3 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if (!map.containsKey(temp)){
                map.put(temp,t.charAt(i));
            }
            else{
                if (map.get(temp)!=t.charAt(i))
                    return false;
            }
        }
        Map<Character,Character> map2 = new HashMap<>();
        for (int i=0;i<t.length();i++){
            char temp = t.charAt(i);
            if (!map2.containsKey(temp)){
                map2.put(temp,s.charAt(i));
            }
            else{
                if (map2.get(temp)!=s.charAt(i))
                    return false;
            }
        }
        return true;
    }
}


