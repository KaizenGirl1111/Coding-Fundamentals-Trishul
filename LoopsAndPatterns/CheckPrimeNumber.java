package LoopsAndPatterns;

import java.util.*;

public class CheckPrimeNumber {
    public static Boolean isPrime(Integer N) {
        if (N <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            Integer N = sc.nextInt();
            System.out.println(isPrime(N));
        }
        sc.close();
    }
}
