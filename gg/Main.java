package gg;
import transport.*; //import all class from the package 'transport'
public class Main {

	public static void main(String[] args)
	{
		//Create EBike with id and battery percentage
        EBike a = new EBike("EB-102", 60);
        a.deliver("Pizza", "Library");

        Drone d = new Drone("DR-05");
        d.deliver("Notes", "ExamCell");   
        d.deliver("USB", "ISE Block");    

      //calculate cost for drone delivery
        double bill = d.cost(6);
        //print the cost calculated
        System.out.println("Drone delivery cost: Rs." + bill);
 
	}

}
