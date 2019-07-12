public class ShapeCalculator {

    double squareArea(Square square){

        double result = square.sideA * square.sideA;

        return  result;
    }

    double circleArea(Circle cirle){

        double result = 3.14 * cirle.radius * cirle.radius;

        return result;
    }

    double trianglePerimeter(Triangle triangle){

        double result = triangle.sideA + triangle.sideB + triangle.sideC;

        return result;
    }

    double rectPerimeter(Rectangle rectangle){

        double result = 2 * (rectangle.sideA + rectangle.sideB);

        return result;
    }
}
