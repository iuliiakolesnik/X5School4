package Task1;

public class Circle implements Shape {

    double radius;

    @Override
    public double square() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    Circle(double radius) {
        this.radius = radius;
    }
}
