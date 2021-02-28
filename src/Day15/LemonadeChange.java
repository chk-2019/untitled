package Day15;

public class LemonadeChange {
    public static void main(String[] args) {
        int test[] = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        Solution6 solution6 = new Solution6();
        boolean b = solution6.lemonadeChange(test);
        System.out.println(b);
    }
}
class Solution6 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0;i<bills.length;i++){
            int zhaoling = bills[i]-5;
            if (zhaoling==0)
                five++;
            if (zhaoling==5){
                five--;
                ten++;
                if (five<0)
                    return false;
            }
            if (zhaoling==15){
                ten--;
                five--;
                if (ten<0){
                    ten++;
                    five-=2;
                }
                if (five<0)
                    return false;

            }

        }
        return true;
    }
}
