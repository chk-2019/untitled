package Day67;

public class MaxSatisfied {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int customers[] = {1,0,1,2,1,1,7,5};
        int grumpy[] = {0,1,0,1,0,1,0,1};
        int sout = solution.maxSatisfied2(customers, grumpy, 3);
        System.out.println(sout);
    }
}
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int noAngrySatisfied = 0;
        int angrySatisfied = 0;
        int sum=0;
        for (int i = 0; i < X; i++) {
            noAngrySatisfied+=customers[i];
            angrySatisfied+=grumpy[i]==1?0:customers[i];
            sum+=grumpy[i]==1?0:customers[i];
        }
        int difference = noAngrySatisfied-angrySatisfied;
        for (int i = X,left=0; i < customers.length; i++) {
            noAngrySatisfied+=customers[i];
            angrySatisfied+=grumpy[i]==1?0:customers[i];
            noAngrySatisfied-=customers[left];
            angrySatisfied-=grumpy[left]==1?0:customers[left];
            sum+=grumpy[i]==1?0:customers[i];
            difference = Math.max(difference,noAngrySatisfied-angrySatisfied);
            left++;
        }
        return sum+difference;
    }
    public int maxSatisfied2(int[] customers, int[] grumpy, int X) {
        int satisfied = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i]==0){
                satisfied+=customers[i];
                customers[i]=0;
            }
        }
        int maxSatisfied = 0;
        int sum = 0;
        for (int i = 0,j=0;i < customers.length; i++) {
            if (i-j>=X){
                sum-=customers[j];
                j++;
            }
            sum+=customers[i];
            maxSatisfied = Math.max(sum,maxSatisfied);
        }
        return maxSatisfied+satisfied;
    }
}