package transport;

public abstract class Vehicle //abstract means cannot create object of Vehicle class 
{
    protected String id;

    public Vehicle(String id)  //constructor of Vehicle class
    {
        this.id = id;
        //printing statement that indicate the Vehicle() constructor has been called
        System.out.println("Vehicle() constructor called");
    }
//Abstarct method
    public abstract void deliver(String item, String place);
}
