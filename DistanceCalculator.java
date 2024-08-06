import java.util.Scanner;
public class DistanceCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Input coordinates for two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
        // Calculate the differences in x and y coordinates
        double dx = x2 - x1;
        double dy = y2 - y1;
        
        // Calculate the distance using the Euclidean distance formula
        double distance = Math.sqrt(dx * dx + dy * dy);
        
        // Print the result
        System.out.printf("The distance between the points (%.2f, %.2f) and (%.2f, %.2f) is %.2f%n",
                          x1, y1, x2, y2, distance);
        
        // Close the scanner
        scanner.close();
    }
}