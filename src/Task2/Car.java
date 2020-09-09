package Task2;

public abstract class Car {

    String model;
    String carClass;
    double weight;
    Engine engine;

    Car(String model, String carClass, double weight, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    abstract void start();

    abstract void stop();

    abstract void printInfo();

    void turnRight() {
        System.out.println("Поворот направо");
    }

    void turnLeft() {
        System.out.println("Поворот налево");
    }

}
