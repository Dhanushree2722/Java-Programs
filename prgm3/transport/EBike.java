package transport;
// here EBike extends Bicycle class
public class EBike extends Bicycle
{
	// variable to store battery percentage
    private int battery;
//constructor to initialize EBike object
    public EBike(String id, int battery) {
        super(id); //super class
        this.battery = battery;  //Initializes battery
        System.out.println("EBike() constructor called");
        //EBike() constructor called
    }

    @Override
    public void deliver(String item, String place)
    {
    	//checking battery percentage
        System.out.println("Checking battery: " + battery + "%");
        super.deliver(item, place); // call Bicycle deliver
    }
}
