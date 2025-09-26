package Assingment2;

public class Point {
	
	    protected int x, y;

	    // Default constructor
	    public Point() {
	        this.x = 0;
	        this.y = 0;
	    }

	    // Parameterized constructor
	    public Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    public void display() {
	        System.out.println("Point coordinates: (" + x + ", " + y + ")");
	    }
	}

	class ColorPoint extends Point {
	    private String color;

	    public ColorPoint() {
	        super();
	        this.color = "undefined";
	    }

	    public ColorPoint(int x, int y, String color) {
	        super(x, y);
	        this.color = color;
	    }

	    @Override
	    public void display() {
	        System.out.println("ColorPoint coordinates: (" + x + ", " + y + "), Color: " + color);
	    }
	}

	class Point3D extends Point {
	    private int z;

	    public Point3D() {
	        super();
	        this.z = 0;
	    }

	    public Point3D(int x, int y, int z) {
	        super(x, y);
	        this.z = z;
	    }

	    @Override
	    public void display() {
	        System.out.println("Point3D coordinates: (" + x + ", " + y + ", " + z + ")");
	    }
	}



