public class Shape {
    private Point[] points;

    // Constructor to initialize a shape with an array of points
    public Shape(Point[] points) {
        this.points = points;
    }

    // Calculate and return the perimeter of the shape
    public double perimeter() {
        double totalPerimeter = 0;

        for (int i = 0; i < points.length - 1; i++) {
            totalPerimeter += points[i].distanceTo(points[i + 1]);
        }

        // Closing the shape by adding the distance from the last point to the first point
        totalPerimeter += points[points.length - 1].distanceTo(points[0]);

        return totalPerimeter;
    }

    // Find and return the length of the longest side in the shape
    public double longestSide() {
        double longest = 0;

        for (int i = 0; i < points.length - 1; i++) {
            double sideLength = points[i].distanceTo(points[i + 1]);
            if (sideLength > longest) {
                longest = sideLength;
            }
        }

        // Check the closing side
        double closingSide = points[points.length - 1].distanceTo(points[0]);
        if (closingSide > longest) {
            longest = closingSide;
        }

        return longest;
    }

    // Calculate and return the average length of the sides in the shape
    public double averageSide() {
        double totalLength = 0;

        for (int i = 0; i < points.length - 1; i++) {
            totalLength += points[i].distanceTo(points[i + 1]);
        }

        // Closing side
        totalLength += points[points.length - 1].distanceTo(points[0]);

        return totalLength / points.length;
    }
}

