import java.util.Arrays;

public class plusOne {
    public static void main(String[] args){
        int[] digits = new int[]{4,3,2,9};
        plusOne(digits);
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            digits[i]++;
            digits[i] = digits[i]%10;
            if (digits[i] != 0)
                return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
