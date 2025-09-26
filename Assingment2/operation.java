package Assingment2;

public interface operation {
	interface Operation {
	    double PI = 3.142;

	    double area();
	    double volume();
	}

	class Circle implements Operation {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double area() {
	        return PI * radius * radius;
	    }

	    @Override
	    public double volume() {
	        // Volume is not applicable for circle, return 0 or handle gracefully
	        return 0;
	    }

	    public void display() {
	        System.out.println("Circle with radius: " + radius);
	        System.out.println("Area: " + area());
	        System.out.println("Volume: " + volume());
	    }
	}

	class Cylinder implements Operation {
	    private double radius;
	    private double height;

	    public Cylinder(double radius, double height) {
	        this.radius = radius;
	        this.height = height;
	    }

	    @Override
	    public double area() {
	        // Surface area of cylinder = 2πr(h + r)
	        return 2 * PI * radius * (height + radius);
	    }

	    @Override
	    public double volume() {
	        // Volume = πr²h
	        return PI * radius * radius * height;
	    }

	    public void display() {
	        System.out.println("Cylinder with radius: " + radius + " and height: " + height);
	        System.out.println("Area: " + area());
	        System.out.println("Volume: " + volume());
	    }
	}

	// Main method to test
	public class OperationTest {
	    public static void main(String[] args) {
	        Circle c = new Circle(5);
	        c.display();

	        System.out.println();

	        Cylinder cy = new Cylinder(3, 7);
	        cy.display();
	    }
	}


}
