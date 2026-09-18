import java.util.*;

public class CheckPrimeNumber {
    public static Boolean isPrime(Integer N) {
        if (N <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            int m = 1;
            if (N % i != 0) {
                for (int j = i; j <= i; j = j * m) {
                    m++;
                    continue;
                }
            } else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        System.out.println(isPrime(N));
        sc.close();
    }
}