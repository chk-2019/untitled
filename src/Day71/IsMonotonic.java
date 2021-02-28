package Day71;

import java.util.Arrays;

public class IsMonotonic {
    public static void main(String[] args) {

    }
}
class Solution {
    public boolean isMonotonic(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (i-1>=0&&A[i]!=A[i-1]){
                if (A[i]>A[i-1]){
                    while(i<A.length){
                        if (A[i]<A[i-1])
                            return false;
                        i++;
                    }
                    return true;
                }
                else{
                    while(i<A.length){
                        if (A[i]>A[i-1])
                            return false;
                        i++;
                    }
                    return true;
                }
            }
        }
        return true;
    }
}