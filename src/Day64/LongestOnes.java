package Day64;

public class LongestOnes {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int A[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int res = solution4.longestOnes(A, 3);
        System.out.println(res);
    }
}
class Solution4 {
    public int longestOnes(int[] A, int K) {
        int res = 0;
        for (int left = 0,right=0; right < A.length; right++) {
            if (A[right]==0&&K!=0){
                K--;
            }
            else if (A[right]==0&&K==0){
                while (A[left]==1){
                    left++;
                }
                left++;
            }
            res = Math.max(right-left+1,res);
        }
        return res;
    }
}