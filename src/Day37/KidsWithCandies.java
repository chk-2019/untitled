package Day37;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int candies[] = {2,3,5,1,3};
        System.out.println(solution2.kidsWithCandies(candies,3));;
    }
}
class Solution2 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        int max = Integer.MIN_VALUE;
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (candies[i]>max)
                max=candies[i];
        }
        for (int i = 0; i < len; i++) {
            if (candies[i]+extraCandies>=max)
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }
}