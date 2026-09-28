package LoopsAndPatterns;

import java.util.*;

public class DigitalRoot {
    public static void CalculateDigitalRoot(Integer N) {
        Integer currentDigit = N;
        Integer digitalRoot = currentDigit;
        while (digitalRoot / 10 > 0) {
            digitalRoot = 0;
            while (currentDigit > 0) {
                digitalRoot += currentDigit % 10;
                currentDigit = currentDigit / 10;
            }
            currentDigit = digitalRoot;
        }
        System.out.println(currentDigit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        sc.close();
        CalculateDigitalRoot(N);
    }
}
