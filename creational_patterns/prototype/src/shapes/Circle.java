package shapes;

// Concrete prototypes
public class Circle implements Shape {
    private int x, y, radius;
    private String color; // New field

    public Circle(int x, int y, int radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public Shape clone() {
        return new Circle(x, y, radius, color);
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public boolean equals(Shape other) {
        if (other == null || !(other instanceof Circle)) 
            return false;
        if (this == other) 
            return true;

        Circle otherCircle = (Circle) other;
        return x == otherCircle.getX() && y == otherCircle.getY() && radius == otherCircle.getRadius() && color.equals(otherCircle.getColor());
    }
}