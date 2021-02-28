package Day23;

public class SumNums {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sumNums(2));
    }
}
class Solution {
    public int sumNums(int n) {
        boolean flag = n>0&&(n+=sumNums(n-1))>0;
        return n;
    }
}