package ConditionalAndLogic;

import java.util.*;

public class LargestOfThreeNumbers {

    public static Integer LargestNumber(Integer A, Integer B, Integer C) {
        if (A >= B && B >= C) {
            return A;
        } else if (A >= C && C >= B) {
            return B;
        } else if (B >= A && A >= C) {
            return B;
        } else if (B >= C && C >= A) {
            return B;
        } else if (C >= A && A >= B) {
            return C;
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        Integer C = sc.nextInt();
        sc.close();
        System.out.println(LargestNumber(A, B, C));
    }
}
