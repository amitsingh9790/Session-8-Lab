// Base class Vehicle
public class Vehicle {
    // Attributes of the Vehicle class
    protected String make;
    protected String model;
    protected int year;
    protected int maximumSpeed;

    //Parameterized Constructor for Vehicle class
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }
    // Method to simulate driving
    public void drive(){
        System.out.println(make+" "+model+" "+"Vehicle is driving.");
    }
    //Setter and Getter Methods for Vehicle attributes
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }
}
//Subclass Car extending Vehicle
class Car extends Vehicle{
    //Constructor for the Car class, calling the superclass constructor
    Car(String make,String model, int year, int maximumSpeed){
        super(make,model,year,maximumSpeed);
    }

    @Override
    public void drive(){
        System.out.println(make+" "+model+" "+"Car is driving.");
    }
}

class Bike extends Vehicle{
    // Constructor for the Bike class, calling the superclass constructor
    Bike(String make,String model, int year, int maximumSpeed){
    super(make,model,year,maximumSpeed);
    }

    @Override
    public void drive(){
        System.out.println(make+" "+model+" "+"Bike is driving.");
    }
}

// Main class to test the Vehicle, Car, and Bike classes
class Main{
    public static void main(String[] args) {
        //Creating a Car object
        Car car = new Car("Audi","XM5",2005,350);
        //Printing Car attributes
        System.out.println("Make:"+car.getMake()+", Model:"+car.getModel()+", Year:"+car.getYear()+", MaximumSpeed:"+car.maximumSpeed);
        //Calling the drive method for Car
        car.drive();

        //Creating a Bike object
        Bike bike = new Bike("BMW","M100R",2001,200);
        //Printing Bike attributes
        System.out.println("Make:"+bike.getMake()+", Model:"+bike.getModel()+", Year:"+bike.getYear()+", MaximumSpeed:"+bike.maximumSpeed);
        // Calling the drive method for Bike
        bike.drive();
    }
}