public class Car {
    // These are the properties of Car
    // These all are primitive data types
    int maxSpeed = 100; //Camel case - famous writing style in programming
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';

    public static void main(String[] args) {
        // To build a car we need to create a instance of it
        Car familyCar = new Car();
        System.out.println("Family's Car:");
        familyCar.printVariables();
        Car samCar = familyCar;
        familyCar.wreckCar();
        System.out.println("Sam's Car: ");
        samCar.printVariables();
        familyCar.upgradeMinSpeed();
        System.out.println("Change in speed:");
        familyCar.printVariables();
    }

    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
}
