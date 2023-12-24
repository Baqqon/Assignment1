public class Point {
    private double x;
    private double y;

    // Constructor to initialize a point with given coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Calculate and return the distance from the current point to the destination point
    public double distanceTo(Point destination) {
        double deltaX = destination.x - this.x;
        double deltaY = destination.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Provide a string representation of the point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
