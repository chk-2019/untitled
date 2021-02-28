package Day29;

public class MinCount {
    public static void main(String[] args) {

    }
}
class Solution {
    public int minCount(int[] coins) {
        int len = coins.length;
        int count=0;
        for (int i = 0; i < len; i++) {
            while (coins[i]>1){
                coins[i]=coins[i]-2;
                count++;
            }
            if (coins[i]==1)
                count++;
        }
        return count;
    }
}