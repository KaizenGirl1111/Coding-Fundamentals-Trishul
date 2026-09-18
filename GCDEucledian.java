import java.util.*;

public class GCDEucledian {
    public static Integer GCD(Integer A, Integer B) {
        Integer gcd = 1;
        while (B != 0) {
            if (A > B) {
                gcd = A % B;
                A = B;
                B = gcd;
            } else {
                gcd = B % A;
                B = A;
                A = gcd;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        System.out.println(GCD(A, B));
        sc.close();
    }
}
