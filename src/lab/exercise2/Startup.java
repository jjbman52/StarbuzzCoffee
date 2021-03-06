package lab.exercise2;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();

        // do output for decorated shapes here...
        Shape redBorderCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nRed Border Circle");
        redBorderCircle.draw();
        
        Shape redBorderRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRed Border Rectangle");
        redBorderRectangle.draw();
    }
}
