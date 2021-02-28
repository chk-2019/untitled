package Day68;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public static void main(String[] args) {
//        String s = "abcd";
//        String substring = s.substring(0, 1);
//        System.out.println(substring);
        Solution2 solution2 = new Solution2();
        List<String> strings = solution2.letterCombinations("23");
        System.out.println(strings
        );

    }
}
class Solution2 {
    public List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        String keys[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if (digits.length()==0){
            return result;
        }
        if (digits.length()==1){
            String value = keys[(int)digits.charAt(0)-'0'-2];
            for (int i = 0; i < value.length(); i++) {
                result.add(String.valueOf(value.charAt(i)));
            }
            return result;
        }
        String value = keys[digits.charAt(digits.length()-1)-'0'-2];
        List<String> list2 = letterCombinations(digits.substring(0,digits.length()-1));
        for (String temp:list2){
            for (int i = 0; i < value.length(); i++) {
                result.add(temp+value.charAt(i));
            }
        }
        return result;

    }
}