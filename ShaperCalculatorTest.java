public class ShaperCalculatorTest {
    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();

        Square square1 = new Square(4.5);
        Rectangle rectangle1 = new Rectangle(2.3,7);
        Circle circle1 = new Circle(2.5);
        Triangle triangle1 = new Triangle(3,2.7,5);

        double squareA = calculator.squareArea(square1);
        double rectangleP = calculator.rectPerimeter(rectangle1);
        double circleA = calculator.circleArea(circle1);
        double triangleP = calculator.trianglePerimeter(triangle1);

        System.out.println("Pole kwadratu wynosi: " + squareA);
        System.out.println("Obwód prostokąta wynosi: " + rectangleP);
        System.out.println("Pole koła wynosi: " + circleA);
        System.out.println("Obwód trójkąta wynosi: " + triangleP);
    }
}
