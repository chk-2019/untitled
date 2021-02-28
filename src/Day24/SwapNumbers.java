package Day24;

public class SwapNumbers {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] swapNumbers(int[] numbers) {
        numbers[0]=numbers[1]-numbers[0];
        numbers[1]=numbers[1]-numbers[0];
        numbers[0]=numbers[1]+numbers[0];
        return numbers;
    }
}
