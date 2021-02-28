package Day52;

import java.util.ArrayList;
import java.util.List;

public class DefangIPaddr {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.defangIPaddr("1.1.1.1"));
    }
}
class Solution2 {
    public String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i)=='.'){
                stringBuilder.append("[.]");
            }
            else{
                stringBuilder.append(String.valueOf(address.charAt(i)));
            }
        }
        return stringBuilder.toString();
    }
}