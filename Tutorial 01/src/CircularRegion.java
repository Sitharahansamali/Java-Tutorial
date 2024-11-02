class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to compute area
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Method to compute circumference
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircularRegion {
    public static void main(String[] args) {
        Circle outerCircle = new Circle(7); // Example radii
        Circle innerCircle = new Circle(3);

        double areaOuter = outerCircle.computeArea();
        double areaInner = innerCircle.computeArea();

        double shadedArea = areaOuter - areaInner;
        System.out.println("The area of the circular region is: " + shadedArea);
    }
}
