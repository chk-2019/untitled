package Day45;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int A[] = {1,2,0,0};
        solution.addToArrayForm(A,34);
    }
}
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int numA = 0;
        for (int i = 0; i < A.length; i++) {
            numA = numA*10+A[i];
        }
        int res = numA+K;
        String s = String.valueOf(res);
        List<Integer> resList  = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            resList.add(Integer.valueOf(s.charAt(i))-48);
        }
        return resList;
    }
}