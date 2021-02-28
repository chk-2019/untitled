package Day55;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int A[] = {1,2,5};
        int B[] = {2,4};
        int[] ints = solution.fairCandySwap(A, B);
        System.out.println(ints);
    }
}
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        int res[] = new int[2];
        for (int i = 0; i < A.length; i++) {
            sumA+=A[i];
        }
        for (int i = 0; i < B.length; i++) {
            sumB+=B[i];
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int differ = sumA-((sumB+sumA)/2);
        int i = 0;
        int j = 0;
        while (i<A.length||j<B.length){
            int temp = A[i]-B[j];
            if (temp<differ){
                i++;
                continue;
            }
            if (temp>differ){
                j++;
                continue;
            }
            else{
                res[0]=A[i];
                res[1]=B[j];
                break;
            }
        }

        return res;
    }
}