package Task1;

public class Rectangle implements Shape {

    double length;
    double height;

    Rectangle(double length, double height) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double square() {
        return this.length * this.height;
    }
}
