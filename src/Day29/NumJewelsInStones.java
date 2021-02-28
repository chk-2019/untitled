package Day29;

public class NumJewelsInStones {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.numJewelsInStones("ZZ",""));
    }
}
class Solution3 {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (stones.charAt(j)==jewels.charAt(i))
                    count++;
            }
        }
        return count;
    }
}
