package NumberTheoryFundamentals;

import java.util.*;

public class PerfectNumber {
    public static Boolean PerfectNumberChecker(Integer N) {
        int sum = 0;
        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        return sum == N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        sc.close();
        if (PerfectNumberChecker(N) == true) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not Perfect");
        }
    }
}
