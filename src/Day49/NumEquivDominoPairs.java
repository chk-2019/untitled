package Day49;

import java.util.Arrays;

public class NumEquivDominoPairs {
    public static void main(String[] args) {
        //System.out.println(-1/2);
        Solution solution = new Solution();
        int[][] dominoes = {{2,1},{1,2},{1,2},{1,2},{2,1},{1,1},{1,2},{2,2}};
        System.out.println(solution.numEquivDominoPairs(dominoes));
    }
}
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int res[] = new int[100];
        for (int i = 0; i < dominoes.length; i++) {
            Arrays.sort(dominoes[i]);
            int shi = dominoes[i][0];
            int ge = dominoes[i][1];
            res[shi*10+ge]++;
        }
        int re = 0;
        for (int i = 0; i <res.length; i++) {
            re+=(res[i]*(res[i]-1))/2;
        }
        return re;
    }
}