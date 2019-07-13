public class Rectangle {

    double sideA, sideB;

    Rectangle(double a, double b){
        sideA = a;
        sideB = b;
    }

    double rectPerimeter(){

        double result = 2 * (sideA + sideB);

        return result;
    }
}
