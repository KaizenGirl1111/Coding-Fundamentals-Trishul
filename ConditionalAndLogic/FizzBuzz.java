package ConditionalAndLogic;

import java.util.*;

public class FizzBuzz {
    public static void FizzBuzzGame(Integer N) {
        if (N % 15 == 0) {
            System.out.print("FizzBuzz ");
        } else if (N % 3 == 0) {
            System.out.println("Fizz ");
        } else if (N % 5 == 0) {
            System.out.print("Buzz ");
        } else {
            System.out.print(N + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        sc.close();
        FizzBuzzGame(N);
    }
}
