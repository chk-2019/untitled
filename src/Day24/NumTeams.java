package Day24;

public class NumTeams {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int rating[] = {1,2};
        System.out.println(solution3.numTeams(rating));
    }
}
class Solution3 {
    public int numTeams(int[] rating) {
        if (rating.length<3)
            return 0;
        int count=0;
        for (int i=0;i<rating.length;i++){
            for (int j=i+1;j<rating.length;j++){
                if (rating[j]>rating[i]){
                    for (int k=j+1;k<rating.length;k++){
                        if (rating[k]>rating[j])
                            count++;
                    }
                }
                if (rating[j]<rating[i]){
                    for (int k=j+1;k<rating.length;k++){
                        if (rating[k]<rating[j])
                            count++;
                    }
                }
            }
        }
        return count;
    }
}