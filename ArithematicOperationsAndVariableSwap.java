import java.util.Scanner;

public class ArithematicOperationsAndVariableSwap {
    public static Integer Sum(Integer a, Integer b) {
        return a + b;
    }

    public static Integer Diff(Integer a, Integer b) {
        return a - b;
    }

    public static Integer Product(Integer a, Integer b) {
        return a * b;
    }

    public static Integer Quotient(Integer a, Integer b) {
        return a / b;
    }

    public static void Swap(Integer a, Integer b) {
        Integer temp = a;
        a = temp;
        temp = b;
        System.out.println("A=" + a + "B=" + b);
    }

    public static void SwapArth(Integer a, Integer b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A=" + a + "B=" + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        String swap = sc.nextLine();
        switch (swap) {
            case "swap":
                Swap(a, b);
                break;
            default:
                System.out.println("Sum=" + Sum(a, b) + " Diff=" + Diff(a, b) + " Product=" + Product(a, b)
                        + " Quotient=" + Quotient(a, b));
                break;
        }
        sc.close();
    }
}