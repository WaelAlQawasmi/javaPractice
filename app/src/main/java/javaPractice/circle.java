package javaPractice;

public class circle extends shape implements circleProperties {
    double Radius;

    public circle(String name, double width) {
        super(name);
        this.Radius = width;
    }

    @Override
    public double area() {
        return Math.PI * 2 * Math.pow(Radius, 2);
    }



    public static double area(double Radius) {
        return Math.PI * 2 * Math.pow(Radius, 2);
    }

    @Override
    public double Perimeter() {
        return Math.PI * 2 * Radius;
    }


    @Override
    public double Diameter() {
        return 2 * Radius;
    }
}
