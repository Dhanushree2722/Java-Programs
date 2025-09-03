package transport;
//here bicycle extends the abstract class Vehicle
public class Bicycle extends Vehicle 
{

    public Bicycle(String id)  //constructor of bicycle class
    {
        super(id);   //superclass
        //prints the message to say that Bicycle constructor has called
        System.out.println("Bicycle() constructor called");
    }
//This method overrides the abstract method
    @Override
    public void deliver(String item, String place) 
    {
    	//prints the delivery message that item ,place and also vehicle type
        System.out.println("Delivering the " + item + " to " + place + " by Bicycle.");
    }
}
