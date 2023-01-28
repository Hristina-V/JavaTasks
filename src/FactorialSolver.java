import java.util.Scanner;

public class FactorialSolver {
    public static void main(String args[]) throws Exception {
        //calculateFactorialForInputNumber();
        printFactorialForNumbersUntilInput(20);
    }

    private static void printFactorialForNumbersUntilInput(int n) throws Exception {
        for(int i=0; i<=n; i++) {
            int fact = calculateFactorial(i);
            System.out.println(i + " Fact = " + fact);
        }
    }

    private static void calculateFactorialForInputNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a number:");
            int n = sc.nextInt();
            int factorial = 0;
            try {
                factorial = calculateFactorial(n);
                System.out.println("!" + n + " = " + factorial);
            } catch (Exception e) {
                System.out.println("We support factorial only for positive numbers");
                System.out.println("Error message is: " + e.getMessage());
            }
        }
    }

    private static int calculateFactorial(int n) throws Exception {
        int factorial = 1;
        if (n < 0 || n > 16) {
            throw new Exception("Invalid number " + n);
        } else if (n == 0) {
            factorial = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
        }

        return factorial;
    }
}
