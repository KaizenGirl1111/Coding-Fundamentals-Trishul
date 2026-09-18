package NumberTheoryFundamentals;

import java.util.*;

public class Fibonacci {
    public static Integer fibonacci(Integer N) {
        Integer secondLast = 0;
        Integer last = 1;
        Integer current = 0;
        if (N == 1)
            return 0;
        if (N == 2)
            return 1;
        for (Integer i = 3; i <= N; i++) {
            current = last + secondLast;
            secondLast = last;
            last = current;

        }
        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        sc.close();
        System.out.println(fibonacci(N));
    }
}
