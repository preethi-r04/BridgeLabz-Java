package CoreProgramming.Constructor;

class Circle {
    private double radius;

  
    public Circle() {
        this(1.0); 
    }

    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleApp {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println(c1.calculateArea());
        System.out.println(c2.calculateArea());
    }
}
