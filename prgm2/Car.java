package prgm2;

public class Car {
//Data members that store information about the car
    private String brand;     //brand name
    private String model;     //model
    private double price;     //price of the car
    private double mileage;   // mileage of the car
    private String ownerName; //car owner
    
    private static int totalCars;          
    private static String showroomName = "Dream Wheels";  //Name of the showroom
// Constructor which is used to create and initialize car objects
    public Car(String b, String m, double p, double mil) {
        this.brand=b;
        this.model=m;
        this.price=p;
        this.mileage=mil;
        ownerName = "Dhanushree";
        totalCars++;
        
    }
    public Car(String b, String m, double p, double mil, String owner) {
        this.brand = b;  
        this.model = m;  
        this.price = p;  
        this.mileage = mil;  
        this.ownerName = owner;
        totalCars++;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String owner) {
        this.ownerName = owner;
    }

    public void displayDetails() {
        System.out.println("Brand of the car: " + this.brand);
        System.out.println("Model of the car: " + this.model);
        System.out.println("Price of the car: " + this.price);
        System.out.println("Mileage of the car: " + this.mileage);
        System.out.println("Owner of the car: " + this.ownerName);
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public static void showTotalCars() {
        System.out.println("Total Cars in the Showroom: " + totalCars);
    }

    public static void showShowroomName() {
        System.out.println("Showroom: " + showroomName);
    }
}
