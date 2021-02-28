package Day57;

import java.util.HashSet;
import java.util.Set;

public class CountServers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int grid[][] ={{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
        System.out.println(solution.countServers(grid));;
    }
}
class Solution {
    public int countServers(int[][] grid) {
        int column = grid[0].length;
        int row = grid.length;
        Set<String> connected = new HashSet<>();
        for (int i = 0; i < row; i++) {
            Set<String> setX = new HashSet<>();
            for (int j = 0; j < column; j++) {
                if (grid[i][j]==1) {
                    setX.add(i+","+j);
                }
            }
            if (setX.size()>1){
                connected.addAll(setX);
            }
        }
        for (int i = 0; i < column; i++) {
            Set<String> setY = new HashSet<>();
            for (int j = 0; j < row; j++) {
                if (grid[j][i]==1){
                    setY.add(j+","+i);
                }
            }
            if (setY.size()>1){
                connected.addAll(setY);
            }
        }
        return connected.size();
    }
    //方法二：
    public int countServers2(int[][] grid) {
        int rowNum = grid.length;
        int colNum = grid[0].length;
        int serverCountRow[] = new int[rowNum];
        int serverCountCol[] = new int[colNum];
        int serverCount = 0;
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (grid[i][j]==1){
                    serverCountRow[i]++;
                    serverCountCol[j]++;
                }
            }
        }
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (grid[i][j]==1){
                    if (serverCountRow[i]>1||serverCountCol[j]>1)
                        serverCount++;
                }
            }
        }
        return serverCount;
    }
}