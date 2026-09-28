package LoopsAndPatterns;

import java.util.*;

public class PrintPrimesInRange {
    public static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (CheckPrimeNumber.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            printPrimes(start, end);
        }
        sc.close();
    }
}
