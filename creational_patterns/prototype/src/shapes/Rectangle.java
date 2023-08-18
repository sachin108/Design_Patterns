package shapes;

public class Rectangle implements Shape {
    private int width, height;
    private String color; // New field

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle with width " + width + " and height " + height);
    }

    @Override
    public Shape clone() {
        return new Rectangle(width, height, color);
    }

    @Override
    public void setX(int x) {
        // Not applicable for rectangles
    }

    @Override
    public void setY(int y) {
        // Not applicable for rectangles
    }

    @Override
    public int getX() {
        return 0; // Not applicable for rectangles
    }

    @Override
    public int getY() {
        return 0; // Not applicable for rectangles
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public boolean equals(Shape other) {
        if (other == null || !(other instanceof Rectangle)) 
            return false;
        if (this == other) 
            return true;

        Rectangle otherRectangle = (Rectangle) other;
        return width == otherRectangle.getWidth() && height == otherRectangle.getHeight() && color.equals(otherRectangle.getColor());
    }
}
