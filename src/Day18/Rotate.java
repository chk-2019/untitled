package Day18;

public class Rotate {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int test[][]={{ 5, 1, 9,11},{2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};
        solution.rotate(matrix);
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        solution.rotate(test);
        System.out.println("==========================");
        for (int j=0;j<test.length;j++){
            for (int i = 0;i<test[0].length;i++){
                System.out.print(test[j][i]+" ");
            }
            System.out.println();
        }
    }
}
class Solution {
//    public void rotate(int[][] matrix) {
//        for (int i=0;i<matrix.length;i++){
//            for (int j=0;j<i+1;j++){
//                int temp=matrix[i][j];
//                matrix[i][j]=matrix[j][i];
//                matrix[j][i]=temp;
//            }
//        }
//    }
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int ceng=0;
        while (ceng<=length/2) {
            int n=length-(ceng*2);
            for (int i = 0; i < n-1; i++) {
                int temp = matrix[ceng][i+ceng];
                matrix[ceng][i+ceng] = matrix[n - i - 1+ceng][ceng];
                matrix[n - i - 1+ceng][ceng] = matrix[n - 1+ceng][n - i - 1+ceng];
                matrix[n - 1+ceng][n - i - 1+ceng] = matrix[i+ceng][n - 1+ceng];
                matrix[i+ceng][n - 1+ceng] = temp;
            }
            ceng++;
        }
    }
    public void rotate2(int[][] matrix) {
        if(matrix.length == 0 || matrix.length != matrix[0].length) {
            return;
        }
        int nums = matrix.length;
        int times = 0;
        while(times <= (nums >> 1)){
            int len = nums - (times << 1);
            for(int i = 0; i < len - 1; ++i){
                int temp = matrix[times][times + i];
                matrix[times][times + i] = matrix[times + len - i - 1][times];
                matrix[times + len - i - 1][times] = matrix[times + len - 1][times + len - i - 1];
                matrix[times + len - 1][times + len - i - 1] = matrix[times + i][times + len - 1];
                matrix[times + i][times + len - 1] = temp;
            }
            ++times;
        }
    }


}