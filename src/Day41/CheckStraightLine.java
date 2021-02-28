package Day41;

import java.util.UUID;

public class CheckStraightLine {
    public static void main(String[] args) {
        int coordinates[][] = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        int coordinates2[][] = {{-3,-2},{-1,-2},{2,-2},{-2,-2},{0,-2}};
        int  coordinates3[][] = {{0,1},{0,0},{0,-1}};
        Solution solution = new Solution();
        System.out.println(solution.checkStraightLine(coordinates3));
//        System.out.println(-1.0/-2.0);
        
    }
}
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int len = coordinates.length;
        if (len==2){
            return true;
        }
        int[] coordinate0 = coordinates[0];
        int[] coordinate1 = coordinates[1];
        double x1 = coordinate0[0];
        double x2 = coordinate1[0];
        double y1 = coordinate0[1];
        double y2 = coordinate1[1];
        double k = coordinate0[0]==coordinate1[0]?-1:(y1-y2)/(x1-x2);
        double b = coordinate0[1]-(k*coordinate0[0]);
        for (int i = 2; i < len; i++) {
            if (k==-1){
                if (coordinates[i][0]!=coordinates[0][0])
                return false;
                else
                    continue;
            }
            if(coordinates[i][1]!=k*coordinates[i][0]+b)
                return false;
        }
        return true;
    }
}