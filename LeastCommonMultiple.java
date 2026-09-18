public class LeastCommonMultiple {
    public static Integer LeastMultiple(Integer A, Integer B) {
        int lcm = 1;
        int gcd = 1;
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
        lcm = (A * B) / gcd;
        return lcm;
    }
}
