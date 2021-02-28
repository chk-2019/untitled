package Day60;

import java.util.Stack;

public class MaxScore {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int cardPoints[] = {1,79,80,1,1,1,200,1};
        System.out.println(solution.maxScore2(cardPoints,3));
    }
}
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int left = 0;
        int right = len-1;
        int leftSum = 0;
        int rightSum = 0;
        int res = 0;
        Stack leftStack = new Stack();
        Stack rightStack = new Stack();
        for (int i = 0; i < k; i++) {
            leftSum+=cardPoints[i];
            leftStack.add(cardPoints[i]);
        }
        for (int i = len-1; i >=len-k ; i--) {
            rightSum+=cardPoints[i];
            rightStack.add(cardPoints[i]);

        }
        while (k>0){
            if (leftSum>rightSum){
                res+=cardPoints[left];
                leftSum-=cardPoints[left++];
                rightSum-=(Integer) rightStack.pop();
            }
            else{
                res+=cardPoints[right];
                rightSum-=cardPoints[right--];
                leftSum-=(Integer) leftStack.pop();
            }
            k--;
        }
        return res;
    }

    public int maxScore2(int[] cardPoints, int k){
        int len = cardPoints.length;
        int res=0;
        int sum = 0;
        for (int i = 0; i <len-k ; i++) {
            res+= cardPoints[i];
        }
        for (int i = 0; i < len; i++) {
            sum+=cardPoints[i];
        }
        int minScore = res;
        for (int i = len-k; i <len ; i++) {
            res+=cardPoints[i];
            res-=cardPoints[i-(len-k)];
            minScore = Math.min(res,minScore);
        }
        return sum-minScore;
    }
}
