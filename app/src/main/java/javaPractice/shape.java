package javaPractice;

public abstract class shape {
    private String name;


    public shape(String name) {
        this.name = name;
    }

    public double area() {
        return 0;
    }

    abstract double Perimeter();
}
