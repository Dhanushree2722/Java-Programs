package prgm2;

public class Showroom {
    public static void main(String[] args) 
   //creating three car objects using brand,model,price 
    {
        Car c1 = new Car("BMW", "X5", 55000, 19.5);
        Car c2 = new Car("Jaguar", "XF",30000, 18.0);
        Car c3 = new Car("Volvo", "XC90", 22000, 25.0);

       //display car details before updates  
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();

        c1.setOwnerName("Dhanu");   
        //Using setter to update price
        c1.updatePrice(45000);  

        System.out.println("After Updates:");
        c1.displayDetails();

        Car.showShowroomName();
        //to display total number of cars
        Car.showTotalCars();
    }
}

