public class Car {
    // Everything here are called instance variables.
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Sam";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4; // mpg: mass per gallon

    int numberOfPeopleInCar = 1;

    public Car(int customMinSpeed, double customWeight, boolean customIsTheCarOn) { // here customMinSpeed is a local variable
        minSpeed = customMinSpeed;
        // customMinSpeed = minSpeed; // nothing is going to change though customMinSpeed will become 0 which is the value of minSpeed, it is never gonna be used.
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println("Number of people in the car: " + numberOfPeopleInCar);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn() {
        numberOfPeopleInCar++; // this means the same thing as:  numberOfPeopleInCar = numberOfPeopleInCar + 1;
    }

    public void getOut() {
        // numberOfPeopleInCar = numberOfPeopleInCar - 1;
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public static void main(String[] args) {
        Car birthdayPresent = new Car(500, 5000.545, true);
        System.out.println("Birthday Car:");
        birthdayPresent.printVariables();
        Car christmasPresent = new Car(550, 2000, false);
        System.out.println("Christmas Car:");
        christmasPresent.printVariables();
        System.out.println("-----------------");
        System.out.println("Birthday Car v1:");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles left: " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles: " + birthdayPresent.maxMilesPerFillUp());
        System.out.println();
        System.out.println("Birthday Car v2: ");
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("Birthday Car v3: ");
        birthdayPresent.printVariables();
    }
}
