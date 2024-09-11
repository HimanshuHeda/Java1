import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its perimeter:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circlePerimeter = calculateCirclePerimeter(radius);
                System.out.println("Perimeter of the circle: " + circlePerimeter);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectanglePerimeter = calculateRectanglePerimeter(length, width);
                System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
                break;
            case 3:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                double squarePerimeter = calculateSquarePerimeter(side);
                System.out.println("Perimeter of the square: " + squarePerimeter);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }
}
