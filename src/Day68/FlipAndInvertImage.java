package Day68;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int A[][]={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] ints = solution.flipAndInvertImage(A);
        System.out.println(ints);
    }
}
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int res[][] = new int[A.length][A[0].length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (A[i][res[0].length-1-j]==0)
                    res[i][j]=1;
                else{
                    res[i][j]=0;
                }
            }
        }
        return res;
    }
}