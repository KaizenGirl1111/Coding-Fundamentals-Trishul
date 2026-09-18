package NumberTheoryFundamentals;

import java.util.*;

public class CountDigitsAndSumOfDigits {
    public static void CountAndSum(Integer N) {
        int count = 0;
        int sum = 0;
        while (N > 0) {
            int digit = N % 10;
            sum += digit;
            N = N / 10;
            count++;
        }
        System.out.println("Count of digits is " + count);
        System.out.println("Sum of digits is " + sum);
    }

    public static void main(Integer N) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        CountAndSum(N);
        sc.close();
    }
}
