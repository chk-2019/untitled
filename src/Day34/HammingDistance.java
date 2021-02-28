package Day34;

public class HammingDistance {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        solution2.hammingDistance(1,4);
    }
}
class Solution2 {
    public int hammingDistance(int x, int y) {
        String s = Integer.toBinaryString(x);
        StringBuffer stringBuffer = new StringBuffer(s);
        String sr= stringBuffer.reverse().toString();
        String s1 = Integer.toBinaryString(y);
        StringBuffer stringBuffer1 = new StringBuffer(s1);
        String s1r = stringBuffer1.reverse().toString();
        int count = 0;
        int len = Math.max(s.length(),s1.length());
        for (int i = 0; i < len; i++) {
            char si = i<sr.length()?sr.charAt(i):'0';
            char sri = i<s1r.length()?s1r.charAt(i):'0';
            if (sri!=si)
                count++;
        }
        return count;
    }
}