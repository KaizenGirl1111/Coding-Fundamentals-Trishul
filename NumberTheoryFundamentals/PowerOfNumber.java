package NumberTheoryFundamentals;

import java.util.*;

public class PowerOfNumber {
    public static Integer PowerOfNumberIterative(Integer B, Integer E) {
        Integer power = 1;
        for (Integer i = 1; i <= E; i++) {
            power *= B;
        }
        return power;
    }

    public static Integer PowerOfNumberRecursive(Integer B, Integer E) {
        if (E == 0)
            return 1;
        return PowerOfNumberRecursive(B, E);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer B = sc.nextInt();
        Integer E = sc.nextInt();
        sc.close();
        System.out.println(PowerOfNumberIterative(B, E));
    }
}
