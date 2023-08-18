package shapes;

// Prototype interface
public interface Shape extends Cloneable {
    void draw();
    boolean equals(Shape other);
    Shape clone();
    void setX(int x);
    void setY(int y);
    int getX();
    int getY();
    String getColor();
    void setColor(String color);
}
