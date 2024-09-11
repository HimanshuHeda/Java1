import java.util.Scanner;

public class area_square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        double area = calculateSquareArea(side);

        System.out.println("The area of the square with side length " + side + " is: " + area);

        scanner.close();
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }
}

