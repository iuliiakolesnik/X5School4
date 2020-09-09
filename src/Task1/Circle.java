package Task1;

public class Circle implements Shape {

    double radius;

    @Override
    public double square() {
        return 2 * Math.PI * this.radius;
    }

    Circle(double radius) {
        this.radius = radius;
    }
}
