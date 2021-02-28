package Day17;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int test[] = {1,3,5};
        System.out.println(solution.threeConsecutiveOdds(test));
    }
}
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]%2==1){
                count++;
                if (count>=3)
                    return true;
            }
            else{
                count=0;
            }
        }
        return false;
    }
}