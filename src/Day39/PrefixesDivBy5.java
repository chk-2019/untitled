package Day39;

import java.util.ArrayList;
import java.util.List;

public class PrefixesDivBy5 {
    public static void main(String[] args) {
        int A[] = {1,1,1,0,1};
        Solution solution = new Solution();
        solution.prefixesDivBy5(A);
    }
}
class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int num=0;
        for (int i = 0; i < A.length; i++) {
            num=(num*2+A[i])%10;
            if (num%5==0){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}