import java.util.*;

public class FactorialOfANumber {
    public static Integer Factorial(Integer N) {
        Integer fact = 1;
        for (Integer i = 1; i <= N; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static Integer FindLeastFactor(Integer N) {
        Integer LeastFactor = 1;
        for (Integer i = 1; i <= N; i++) {
            if (N % i == 0) {
                LeastFactor = i;
                break;
            }
        }
        return LeastFactor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        System.out.println(Factorial(N));
        sc.close();
    }
}
