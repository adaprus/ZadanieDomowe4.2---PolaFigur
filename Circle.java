public class Circle {

    double radius;

    Circle(double rad){
        radius = rad;
    }

    double circleArea(){

        double result = 3.14 * radius * radius;

        return result;
    }
}
