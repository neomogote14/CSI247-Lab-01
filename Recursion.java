import java.util.Scanner; // <- added ;

public class Recursion { // <- added class wrapper

    // Recursive factorial method
    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Recursive fibonacci method - prints series
    public static void fibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    // Helper for fibonacci series
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    // Recursive power method
    public static int power(int x, int y) {
        if (y == 0)
            return 1;
        return x * power(x, y - 1);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Factorial");
            System.out.println("2. Fibonacci");
            System.out.println("3. Power");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = keyboard.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter n: ");
                    int n = keyboard.nextInt();
                    System.out.println("Factorial = " + factorial(n));
                    break;

                case 2:
                    System.out.print("Enter n: ");
                    n = keyboard.nextInt();
                    System.out.print("Fibonacci series: ");
                    fibonacci(n);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter x: ");
                    int x = keyboard.nextInt();
                    System.out.print("Enter y: ");
                    int y = keyboard.nextInt();
                    System.out.println("Power = " + power(x, y));
                    break;

                case 4:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        keyboard.close();
    }
} 

