import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyApplication {
    public static void main(String[] args) {
        // Read coordinates from file
        Point[] points = readCoordinatesFromFile();

        // Create a shape with the read points
        Shape shape = new Shape(points);

        // Display information about the shape
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest Side: " + shape.longestSide());
        System.out.println("Average Side: " + shape.averageSide());
    }

    private static Point[] readCoordinatesFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Models.txt"))) {
            Point[] points = new Point[10];
            String line;
            int index = 0;

            while ((line = reader.readLine()) != null && index < 10) {
                String[] coordinates = line.split("\\s+");
                double x = Double.parseDouble(coordinates[0]);
                double y = Double.parseDouble(coordinates[1]);
                points[index++] = new Point(x, y);
            }

            return points;

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }
}
