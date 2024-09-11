import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int result = divideNumbers(num1, num2);
            System.out.println("Result of division: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } 
        finally {
            scanner.close();
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero.");
        }
        return dividend / divisor;
    }
}
