package Day51;

import java.util.ArrayList;
import java.util.List;

public class NumSmallerByFrequency {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        String queries[] = {"bbb","cc"};
        String words[] = {"a","aa","aaa","aaaa"};
        int[] ints = solution2.numSmallerByFrequency(queries, words);
        System.out.println(ints);
    }
}
class Solution2 {
    //方法一
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
//        List<Integer> queriesList = numSmallerByFrequency_helper(queries);
//        List<Integer> wordsList = numSmallerByFrequency_helper(words);
//        int res[] = new int[queriesList.size()];
//        for (int i = 0; i < queriesList.size(); i++) {
//            for (int j = 0; j < wordsList.size(); j++) {
//                if (queriesList.get(i)<wordsList.get(j))
//                    res[i]++;
//            }
//        }
//        return res;

        //方法二：
        int wordsArr[] = new int[11];
        for (int j = 0; j < words.length; j++) {
            wordsArr[numSmallerByFrequency_helper2(words[j])]++;
        }
        for (int i = 9; i >=0 ; i--) {
            wordsArr[i]+=wordsArr[i+1];
        }
        int res[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int num = numSmallerByFrequency_helper2(queries[i]);
            res[i] = wordsArr[num+1];
        }
        return res;
    }
    public List<Integer> numSmallerByFrequency_helper(String[] queries){
        List<Integer> res = new ArrayList<>();
        for(String tempStr:queries){
            int words[] = new int[27];
            for (int i = 0; i < tempStr.length(); i++) {
                words[Integer.valueOf(tempStr.charAt(i)-'a')]++;
            }
            for (int i = 0; i < 27; i++) {
                if (words[i]!=0){
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }

    public int numSmallerByFrequency_helper2(String s){
        int[] words = new int[27];
        for (int i = 0; i < s.length(); i++) {
            words[Integer.valueOf(s.charAt(i)-'a')]++;
        }
        for (int i = 0; i < 27; i++) {
            if (words[i]!=0){
                return words[i];
            }
        }
        return -1;
    }
}