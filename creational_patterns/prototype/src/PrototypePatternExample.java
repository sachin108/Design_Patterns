import shapes.*;

public class PrototypePatternExample {
    public static void main(String[] args) {
        Shape originalCircle = new Circle(10, 20, 5, "Red");
        Shape clonedCircle = originalCircle.clone();

        Shape originalRectangle = new Rectangle(30, 40, "Blue");
        Shape clonedRectangle = originalRectangle.clone();

        originalCircle.draw();
        clonedCircle.draw();

        originalRectangle.draw();
        clonedRectangle.draw();

        // Demonstrating changing properties of cloned objects
        clonedCircle.setX(15);

        clonedRectangle.setX(50);
        System.out.println("Is original rectangle equal to cloned rectangle? " + originalRectangle.equals(clonedRectangle));        

        ((Rectangle) clonedRectangle).setWidth(50);

        clonedCircle.draw();
        clonedRectangle.draw();

        System.out.println("Is original circle equal to cloned circle? " + originalCircle.equals(clonedCircle));
        System.out.println("Is original rectangle equal to cloned rectangle? " + originalRectangle.equals(clonedRectangle));        
    }
}
