package transport;
// Drone class extends vehicle
public class Drone extends Vehicle implements Payable
{
	//constructor for drone
    public Drone(String id) {
        super(id);
        //print the message that drone constructor called
        System.out.println("Drone() constructor called");
    }

    @Override
    public void deliver(String item, String place) {
        if(!SecurityRules.canFly(place)) 
        {
        	// prints flying not allowed and blocked
            System.out.println("Delivery to " + place + " is blocked by security.");
            return;
        }
        //prints delivery allowed
        System.out.println("Delivering " + item + " to " + place + " by Drone.");
    }
//override
    @Override
    public double cost(double distanceKm)
    {
    	// Drone charges
        return 20 * distanceKm; 
    }
}
