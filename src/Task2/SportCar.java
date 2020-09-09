package Task2;

//7.  Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью start(), stop().
// Метод start – выводит на экран «SportCar поехал», метод stop -  «SportCar остановился».
public class SportCar extends Car {

    double speedLimit;

    SportCar(String model, String carClass, double weight, Engine engine, double speedLimit) {
        super(model, carClass, weight, engine);
        this.speedLimit = speedLimit;
    }

    @Override
    void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    void printInfo() {
        System.out.println("speedLimit: " + this.speedLimit + " model: " + this.model + " classCar: " + this.carClass + " weight: " + this.weight + " enginePower: " + this.engine.power + " engineManufacturer: " + this.engine.manufacturer);
    }
}
