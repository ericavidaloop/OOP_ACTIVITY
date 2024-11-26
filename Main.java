public class Main {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(9.0, "green", true);
        System.out.println("Circle: " + circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 6.0, "orange", false);
        System.out.println("\nRectangle: " + rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
  }
