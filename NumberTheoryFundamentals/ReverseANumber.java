package NumberTheoryFundamentals;

import java.util.Scanner;

public class ReverseANumber {
    public static int reverseANumber(int N) {
        int reversedNumber = 0;
        while (N > 0) {
            int remainder = N % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            N = N / 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        System.out.println("Reversed number: " + reverseANumber(N));
    }
}
