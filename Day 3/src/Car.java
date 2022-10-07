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
    int maxNumberOfPeopleInCar = 6;
    public Car(int customMinSpeed, double customWeight, boolean customIsTheCarOn) { // here customMinSpeed is a local variable
        minSpeed = customMinSpeed;
        // customMinSpeed = minSpeed; // nothing is going to change though customMinSpeed will become 0 which is the value of minSpeed, it is never gonna be used.
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    public Car() {

    }
    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println("Number of people in the car: "+numberOfPeopleInCar);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn() {
        // if there aren't too many people in the car
        if (numberOfPeopleInCar <= maxNumberOfPeopleInCar) {
            // then someone can get in
            numberOfPeopleInCar++; // this means the same thing as:  numberOfPeopleInCar = numberOfPeopleInCar + 1;
            System.out.println("Someone got in");
        } else {
            // otherwise print out the fact the car is full!
            System.out.println("The car is full!"+numberOfPeopleInCar+ " = "+maxNumberOfPeopleInCar);
        }
    }
    public void getOut() {
        // numberOfPeopleInCar = numberOfPeopleInCar - 1;
        // if there's people in the car
        if(numberOfPeopleInCar > 0) {
            // then tell one person to get out
            numberOfPeopleInCar--;
        } else {
            // otherwise no one can get out and we'll print that.
            System.out.println("No one is in the car");
        }
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void turnTheCarOn() {
        // If the car isn't on
        if(!isTheCarOn) { // if(isTheCarOn != false)
            // turn it on
            isTheCarOn = true;
        } else {
            // otherwise print out the fact it's on
            System.out.println("The car is already on "+isTheCarOn);
        }
    }
    public static void main(String[] args) {
       Car tommyCar = new Car();
       tommyCar.getOut();
       tommyCar.getOut();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();;
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.turnTheCarOn();
       tommyCar.turnTheCarOn();
    }
}