package finalexam.task1;

public class Circle implements Drawable {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementing the Draw() method from the Drawable interface
    @Override
    public void Draw() {
        System.out.println("Drawing a circle with radius " + radius);
        // Add drawing logic here if needed
    }

    // Main method for testing
    public static void main(String[] args) {
        Circle circle = new Circle(5.0); // Creating a Circle object with radius 5.0
        circle.Draw(); // Calling the Draw method to draw the circle
    }
}