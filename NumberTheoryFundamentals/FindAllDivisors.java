package NumberTheoryFundamentals;

import java.util.*;

public class FindAllDivisors {
    public static void FindDivisors(Integer N) {
        Integer divisor = 1;
        for (Integer i = 1; i <= (int) Math.sqrt(N); i++) {
            if (N % i == 0) {
                divisor = i;
                System.out.print(divisor + " ");
            }
        }
        for (Integer i = (int) Math.sqrt(N); i >= 1; i--) {
            if (N % i == 0) {
                if (divisor != (N / i)) {
                    System.out.print(N / i);
                    divisor = N / i;
                }
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        sc.close();
        FindDivisors(N);
    }
}
