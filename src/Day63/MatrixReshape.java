package Day63;

import java.util.LinkedList;
import java.util.Queue;

public class MatrixReshape {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[][] = {{1,2},{3,4}};
        solution.matrixReshape(nums,2,4);
        System.out.println(1);
    }
}
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int r0 = nums.length;
        if (r0==0)
            return nums;
        int c0 = nums[0].length;
        if (c0*r0<r*c)
            return nums;
        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < r0; i++) {
            for (int j = 0; j < c0; j++) {
                queue.offer(nums[i][j]);
            }
        }
        int res[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.poll();
            }
        }
        return res;
    }
}