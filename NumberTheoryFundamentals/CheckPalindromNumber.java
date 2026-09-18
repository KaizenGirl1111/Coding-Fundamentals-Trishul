package NumberTheoryFundamentals;

import java.util.Scanner;

public class CheckPalindromNumber {
    public static Boolean isPalindrome(Integer N) {
        Integer reversedNumber = 0;
        Integer reminder = 0;
        Integer originalN = N;
        while (N > 0) {
            reminder = N % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            N = N / 10;
        }
        if (originalN == reversedNumber)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        sc.close();
        System.out.println(isPalindrome(N));
    }
}
