package Day22;

public class FindString {
    public static void main(String[] args) {
//        System.out.println("ball".compareTo("ball"));
        Solution2 solution2 = new Solution2();
        //System.out.println("a".compareTo("b"));
        String words[]= {"at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""};
        String test[]={"at"};
        System.out.println(solution2.findString(words,"at"));
    }
}

class Solution2 {
    public int findString(String[] words, String s) {
        int left = 0;
        while (words[left]==""){
            left++;
        }
        int right = words.length-1;
        while (words[right]==""){
            right--;
        }
        while (left<right){
            int mid=(left+right)/2;
            while (words[mid]==""&&mid<=right){
                mid++;
            }
            if (right==mid){
                mid--;
                while (words[mid]==""){
                    mid--;
                }
                if (mid==left){
                    if (words[left].equals(s))
                        return left;
                    else if (words[right].equals(s))
                        return right;
                    else
                        return -1;
                }
            }
            //a.compareTo(b)<0,a<b;反之，a>b
            if (words[mid].compareTo(s)==0)
                return mid;
            else if (words[mid].compareTo(s)<0){
                left=mid;
            }
            else {
                right=mid;
            }
        }
        return words[0].equals(s)?0:-1;
    }
}