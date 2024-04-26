public class Triangle {
    private double a, b, c; // Sides of the triangle

    // Constructor to initialize the sides of the triangle
    public Triangle(double a, double b, double c) {
        // Check if the sides form a valid triangle
        if (a + b > c && a + c > b && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException("The sum of any two sides must be greater than the third side.");
        }
    }

    // Method to find the area of the triangle
    public double findArea() {
        double s = (a + b + c) / 2.0; // Semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    // Method to find the perimeter of the triangle
    public double findPerimeter() {
        return a + b + c;
    }

    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Area of the triangle: " + triangle.findArea());
            System.out.println("Perimeter of the triangle: " + triangle.findPerimeter());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
