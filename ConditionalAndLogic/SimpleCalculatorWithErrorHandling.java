package ConditionalAndLogic;

import java.util.*;

public class SimpleCalculatorWithErrorHandling {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        String op = sc.next();
        long b = sc.nextLong();

        if (op == "%" || op == "/" && b == 0) {
            System.out.println("Error: divison by zero");
            return;
        }

        switch (op) {
            case "-":
                System.out.println(a - b);
                break;
            case "+":
                System.out.println(a + b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
