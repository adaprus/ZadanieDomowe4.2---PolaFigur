public class Triangle {

    double sideA, sideB, sideC;

    Triangle(double a, double b, double c){
        sideA = a;
        sideB = b;
        sideC = c;
    }

    double trianglePerimeter(){

        double result = sideA + sideB + sideC;

        return result;
    }
}
