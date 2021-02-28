package Day44;

public class FloodFill {
    public static void main(String[] args) {
        int image[][] = {{0,0,0},{0,0,0}};
        Solution solution = new Solution();
        solution.floodFill(image,0,0,2);
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int length = image.length;
        int length1 = image[0].length;
        boolean[][] isFilled = new boolean[length+1][length1+1];
        int[][] res = floodFill_helper(image, sr, sc, newColor, isFilled);
        return res;
    }
    public int[][] floodFill_helper(int[][] image, int sr, int sc, int newColor,boolean[][] isFilled) {
        isFilled[sr][sc]=true;
        if (sr-1>=0&&(image[sr-1][sc]==image[sr][sc]&&isFilled[sr-1][sc]==false)){
                floodFill_helper(image,sr-1,sc,newColor,isFilled);
        }
        if (sr+1<image.length&&(image[sr+1][sc]==image[sr][sc]&&isFilled[sr+1][sc]==false)){
                floodFill_helper(image,sr+1,sc,newColor,isFilled);
        }
        if (sc-1>=0&&(image[sr][sc-1]==image[sr][sc]&&isFilled[sr][sc-1]==false)){
                floodFill_helper(image,sr,sc-1,newColor,isFilled);
        }
        if (sc+1<image[0].length&&(image[sr][sc+1]==image[sr][sc]&&isFilled[sr][sc+1]==false)){
            floodFill_helper(image,sr,sc+1,newColor,isFilled);
        }
        image[sr][sc]=newColor;
        return image;
    }
}