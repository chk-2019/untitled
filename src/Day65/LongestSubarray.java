package Day65;

import java.util.*;

public class LongestSubarray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {4,2,2,2,4,4,2,2};
        int res = solution.longestSubarray3(nums, 0);
        System.out.println(res);
    }
}
class Solution {
    //思路一：超时..
    public int longestSubarray(int[] nums, int limit) {
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (maxAbsDiff(Arrays.copyOfRange(nums,i,j+1))>limit)
                    break;
                longest = Math.max(longest,j-i+1);
            }
        }
        return longest;
    }
    public int maxAbsDiff(int nums[]){
        Arrays.sort(nums);
        if (nums.length==0)
                return 0;
        return nums[nums.length-1]-nums[0];
    }
    //思路二：也超时了...
    public int longestSubarray2(int[] nums, int limit) {
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int min = nums[i];
            for (int j = i; j < nums.length; j++) {
                if (nums[j]<min){min = nums[j];}
                if (nums[j]>max){max = nums[j];}
                if (max-min>limit){break;}
                longest = Math.max(longest,j-i+1);
            }
        }
        return longest;
    }
    //思路三：
    public int longestSubarray3(int[] nums, int limit) {
        int res = 0;
        int left = 0;
        int right = 0;
        int len = nums.length;
        TreeMap<Integer, Integer> slideMap = new TreeMap<>(Comparator.naturalOrder());
        while(right<len){
            slideMap.put(nums[right],slideMap.getOrDefault(nums[right],0)+1);
            //如果滑动区间的最大值减去最小值大于limit,那么就将left右移,直到差值小于limit
            while (slideMap.lastKey()-slideMap.firstKey()>limit){
                slideMap.put(nums[left],slideMap.get(nums[left])-1);
                if (slideMap.get(nums[left])==0)
                    slideMap.remove(nums[left]);
                left++;
            }
            res = Math.max(right-left+1,res);
            right++;
        }
        return res;
    }


}
