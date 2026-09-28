package LoopsAndPatterns;

import java.util.*;

public class MultiplicationTable {
    public static void MultiplicationTableofN(Integer N) {
        for (Integer i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        sc.close();
        MultiplicationTableofN(N);
    }
}
