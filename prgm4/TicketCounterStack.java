package source;

	import java.util.Scanner;
	public class TicketCounterStack
	{
		
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Stack st = null;
// choosing two methods to initialize stack
		        System.out.println("Choose initialization:");
		        System.out.println("1. Empty stack with size");
		        System.out.println("2. Stack initialized with array of Persons");
		        int choice = sc.nextInt();
		        sc.nextLine();  
//initialize empty stack
		        if (choice == 1) {
		            System.out.print("Enter size: ");
		            int size = sc.nextInt();
		            sc.nextLine();  
		            st = new Stack(size);
		        } else if (choice == 2) {
		            System.out.print("Enter number of Persons: ");
		            int n = sc.nextInt();
		            sc.nextLine();  
		            Person[] arr = new Person[n];
		            for (int i = 0; i < n; i++) {
		                System.out.println("Enter details for Person " + (i + 1) + ":");
		                Person p = readPerson(sc);
		                arr[i] = p;
		            }
		            st = new Stack(arr);
		        } else {
		            System.out.println("Invalid initialization choice!!!! Exiting.");
		            sc.close();
		            return;
		        }

		        int option;
		        do {
		            System.out.println("\n*******Menu*******");
		            System.out.println("1. Push one Person");
		            System.out.println("2. Push two Persons");
		            System.out.println("3. Pop one Person");
		            System.out.println("4. Pop multiple Persons");
		            System.out.println("5. Display all Persons");
		            System.out.println("6. Display top n Persons");
		            System.out.println("7. Exit");
		            System.out.print("Enter your choice: ");
		            option = sc.nextInt();
		            sc.nextLine(); 
		            //Switch case choice
		            switch(option) {
		                case 1:
		                    System.out.println("Enter the  details for Person to push:");
		                    Person p = readPerson(sc);
		                    st.push(p);
		                    break;

		                case 2:
		                    System.out.println("Enter the details for first Person:");
		                    Person p1 = readPerson(sc);
		                    System.out.println("Enter details for second Person:");
		                    Person p2 = readPerson(sc);
		                    st.push(p1, p2);
		                    break;

		                case 3:
		                    Person popped = st.pop();
		                    if (popped != null) popped.displayPerson();
		                    break;

		                case 4:
		                    System.out.print("Enter number of Persons to pop: ");
		                    int n = sc.nextInt();
		                    sc.nextLine();  // consume newline
		                    st.pop(n);
		                    break;

		                case 5:
		                    st.display();
		                    break;

		                case 6:
		                    System.out.print("Enter number of top Persons to display: ");
		                    int topN = sc.nextInt();
		                    sc.nextLine();  // consume newline
		                    st.display(topN);
		                    break;

		                case 7:
		                    System.out.println("Exiting...");
		                    break;

		                default:
		                    System.out.println("Invalid choice!");
		            }
		        } while(option != 7);

		        sc.close();
		    }

		    //Used to read person details from the Scanner
		    private static Person readPerson(Scanner sc) 
		    {
		    	//read persons name
		        System.out.print("Name: ");
		        String name = sc.nextLine();
               //read persons age
		        System.out.print("Age: ");
		        int age = sc.nextInt();
		        sc.nextLine();  // consume newline

		        Gender gender = null;
		        while (gender == null) {
		            System.out.print("Gender (MALE/FEMALE/OTHER): ");
		            String g = sc.nextLine().toUpperCase();  //convert to uppercase
		            try {
		                gender = Gender.valueOf(g);
		            } catch (IllegalArgumentException e) {
		                System.out.println("Invalid gender. Please enter MALE, FEMALE, or OTHER.");
		            }
		        }
		        //return object of new person
		        return new Person(name,age,gender);
		    }
	}
		    




