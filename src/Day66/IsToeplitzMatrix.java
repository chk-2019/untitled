package Day66;

public class IsToeplitzMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int matrix[][]={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int matrix2[][] = {{1,2},{2,2}};
        System.out.println(solution.isToeplitzMatrix(matrix2));
    }
}
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rowNum = matrix.length;
        int cloNum = matrix[0].length;
        boolean res =true;
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < cloNum; j++) {
                if (i+1<rowNum&&j+1<cloNum){
                    if (matrix[i][j]!=matrix[i+1][j+1])
                        return false;
                }
            }
        }
        return res;
    }
}