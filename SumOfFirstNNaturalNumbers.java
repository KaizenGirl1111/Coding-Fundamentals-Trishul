import java.util.*;

public class SumOfFirstNNaturalNumbers {

    public static Integer ForSum(Integer N, Integer Sum) {
        for (Integer i = 1; i <= N; i++) {
            Sum += i;
        }
        return Sum;
    }

    public static Integer WhileSum(Integer N, Integer Sum) {
        int i = 1;
        while (i <= N) {
            Sum += i;
            i++;
        }
        return Sum;
    }

    public static Integer GaussSum(Integer N) {
        return N * (N + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        System.out.println(GaussSum(N));
        sc.close();
    }
}
