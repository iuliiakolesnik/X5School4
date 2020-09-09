package Task2;

//6. Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузов, реализовать методы start(), stop().
// Метод start – выводит на экран «Грузовик поехал», метод stop -   «грузовик остановился».
public class Lorry extends Car {

    double liftingCapacity;

    Lorry(String model, String carClass, double weight, Engine engine, double liftingCapacity) {
        super(model, carClass, weight, engine);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    void printInfo() {
        System.out.println("liftingCapacity: " + this.liftingCapacity + " model: " + this.model + " classCar: " + this.carClass + " weight: " + this.weight + " enginePower: " + this.engine.power + " engineManufacturer: " + this.engine.manufacturer);
    }
}
