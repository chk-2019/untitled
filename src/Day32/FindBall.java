package Day32;

public class FindBall {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int grid[][]={{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
        int grid2[][]={{1,1,1,1,1,1},{-1,-1,-1,-1,-1,-1},{1,1,1,1,1,1},{-1,-1,-1,-1,-1,-1}};
        System.out.println(solution.findBall(grid2));
    }
}
class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res[]=new int[n];
        for (int i = 0; i < n; i++) {
            res[i]=out(i,grid);
        }
        return res;
    }
    public int out(int nn,int grid[][]){
        int m = grid.length;
        int n = grid[0].length;
        int res=0;
        for (int i=0,j=nn;i<m;){
            if (j==0&&grid[i][j]==-1){
                return -1;
            }
            if (j==n-1&&grid[i][j]==1){
                return -1;
            }
            if (grid[i][j]==1&&grid[i][j+1]==-1){
                return -1;
            }
            if (grid[i][j]==-1&&grid[i][j-1]==1){
                return -1;
            }
            else{
                if (grid[i][j]==1){
                    i=i+1;
                    j=j+1;
                }
                else {
                    i=i+1;
                    j=j-1;
                }
            }
            if (i==m)
                res=j;
        }
        return res;
    }
}