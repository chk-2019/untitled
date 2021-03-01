package Day72;

public class NumArray {
    private int[] arr;
    private int[] preSum;
    public NumArray(int[] nums) {
        this.arr = nums;
        this.preSum = new int[nums.length];
        if (nums.length>0)
            preSum[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            preSum[i]=preSum[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        int res = 0;
        return preSum[j]-preSum[i]+arr[i];
    }
}
