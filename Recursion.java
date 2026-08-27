import java.util.Scanner;
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
