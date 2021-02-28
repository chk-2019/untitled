package Day22;

import java.util.*;

public class Trap {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int height[] = {0,1,0,2,1,0,1,3,1,1,1,1,1,3,2,1,2,1};
        System.out.println(solution.trap(height));
    }
}
class Solution {
    public int trap(int[] height) {
        if (height.length<3)
            return 0;
        int[] clone = height.clone();
        Arrays.sort(clone);
        int max = clone[clone.length-1];
        List<Integer> list = new ArrayList<>();
        //将最大值的下标存放在list中
        for (int i=0;i<height.length;i++){
            if (height[i]==max)
                list.add(i);
        }
        Collections.sort(list);
        int maxLeft=list.get(0);
        int maxRight=list.get(list.size()-1);
        int gao=0;
        int sum=0;
        int left=0;
        gao=height[0];
        //将最高的柱左边的区域连柱带水所有的体积求和
        for (int i=0;i<=maxLeft;i++){
            if (height[i]>height[left]){
                sum+=gao*(i-left);
                left=i;
                gao=height[i];
            }
        }
        //将右边求和
        int right=height.length-1;
        gao = height[right];
        for (int j=height.length-1;j>=maxRight;j--){
            if (height[j]>height[right]){
                sum+=gao*(right-j);
                right=j;
                gao=height[j];
            }
        }
        //加上最高的柱子及能储存的体积
        sum+=(maxRight-maxLeft+1)*max;
        //除去柱子占得体积
        for (int i=0;i<height.length;i++){
            sum-=height[i];
        }
        return sum;
    }
}