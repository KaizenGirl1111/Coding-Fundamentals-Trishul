package ConditionalAndLogic;

import java.util.*;

public class TriangleValidityAndType {
    public static Boolean isValidTriangle(Integer A, Integer B, Integer C) {
        if (A + B > C && A + C > B && B + C > A) {
            return true;
        }
        return false;
    }

    public static String findType(Integer A, Integer B, Integer C) {
        if (A == B && B == C) {
            return "Equilateral";
        } else if (A == B || A == C || B == C) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        Integer C = sc.nextInt();
        sc.close();
        if (isValidTriangle(A, B, C)) {
            System.out.println(findType(A, B, C));
        } else {
            System.out.println("Not a triangle");
        }
    }
}
