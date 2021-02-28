package Day57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PancakeSort {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int arr[] ={1,2,3};
        List<Integer> integers = solution2.pancakeSort(arr);
        System.out.println(integers);
        System.out.println(arr);
    }
}
class Solution2 {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < arr.length-1; i++) {
            int index = findIndex(arr, arr.length - i);
            if (index!=0){
                reverseArr(arr,index+1);
                res.add(index+1);
            }
            reverseArr(arr,arr.length-i);
            res.add(arr.length-i);
        }
        return res;
    }
    private int findIndex(int arr[],int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num)
                return i;
        }
        return -1;
    }
    public void reverseArr(int arr[],int k){
        if (k>arr.length)
            return;
        for (int i = 0; i < k/2; i++) {
            int temp = arr[k-1-i];
            arr[k-1-i]=arr[i];
            arr[i]=temp;
        }
    }
}