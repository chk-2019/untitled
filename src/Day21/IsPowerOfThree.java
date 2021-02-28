package Day21;

public class IsPowerOfThree {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.isPowerOfThree(2147483647));
    }
}
class Solution2 {
    public boolean isPowerOfThree(int n) {
        int ys=0;
        while (n>=3){
            ys=n%3;
            if(ys!=0)
                return false;
            n=n/3;
        }
        return n==1;
    }
}