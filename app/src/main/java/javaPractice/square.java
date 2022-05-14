package javaPractice;

public class square extends shape {
    private double width;

    public square(String name, double width) {
        super(name);
        this.width = width;
    }

    @Override
    public double area() {

        return Math.pow(width, 2);

    }

    @Override
    double Perimeter() {
        return 4 * width;
    }
}
