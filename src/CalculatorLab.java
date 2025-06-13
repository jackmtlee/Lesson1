import java.util.Scanner;

public class CalculatorLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first number (or 'q' to quit): ");
            String input = scanner.next();

            // 1. Check for quit
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Calculator exiting. Goodbye!");
                break;  // exit the while‑loop
            }

            // 2. Parse first number
            double a;
            try {
                a = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
                continue;  // restart loop
            }

            // 3. Read operator
            System.out.print("Enter operator (+, -, *, /, %): ");
            char op = scanner.next().charAt(0);

            // 4. Read second number
            System.out.print("Enter second number: ");
            double b;
            try {
                b = Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
                continue;  // restart loop
            }

            // 5. Compute with switch
            double result;
            switch (op) {
                case '+':
                    result = a + b;
                    System.out.printf("Result: %.2f%n", result);
                    break;  // exit switch
                case '-':
                    result = a - b;
                    System.out.printf("Result: %.2f%n", result);
                    break;
                case '*':
                    result = a * b;
                    System.out.printf("Result: %.2f%n", result);
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Error: Division by zero!");
                    } else {
                        result = a / b;
                        System.out.printf("Result: %.2f%n", result);
                    }
                    break;
                case '%':
                    if (b == 0) {
                        System.out.println("Error: Modulo by zero!");
                    } else {
                        result = a % b;
                        System.out.printf("Result: %.2f%n", result);
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Use +, -, *, /, or %.");
                    break;
            }
            // after switch, loop continues
        }

        scanner.close();
    }
}
