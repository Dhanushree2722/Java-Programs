package source;

	import java.util.Scanner;
	public class TicketCounterStack
	{
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Stack st = null;

	        System.out.println("Choose initialization:");
	        System.out.println("1. Empty stack with size");
	        System.out.println("2. Stack initialized with array of Persons");
	        int choice = sc.nextInt();
	        sc.nextLine(); // consume newline

	        if (choice == 1) {
	            System.out.print("Enter size: ");
	            int size = sc.nextInt();
	            st = new Stack(size);
	        } else if (choice == 2) {
	            System.out.print("Enter number of Persons: ");
	            int n = sc.nextInt();
	            sc.nextLine();
	            Person arr[] = new Person[n];
	            for (int i = 0; i < n; i++) {
	                System.out.print("Enter name: ");
	                String name = sc.nextLine();
	                System.out.print("Enter age: ");
	                int age = sc.nextInt();
	                sc.nextLine();
	                System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
	                String g = sc.nextLine().toUpperCase();
	                Gender gender = Gender.valueOf(g);
	                arr[i] = new Person(name, age, gender);
	            }
	            st = new Stack(arr);
	        }

	        int option;
	        do {
	            System.out.println("\n--- Menu ---");
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

	            switch(option) {
	                case 1:
	                    System.out.print("Enter name: ");
	                    String name1 = sc.nextLine();
	                    System.out.print("Enter age: ");
	                    int age1 = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
	                    String g1 = sc.nextLine().toUpperCase();
	                    Gender gender1 = Gender.valueOf(g1);
	                    st.push(new Person(name1, age1, gender1));
	                    break;

	                case 2:
	                    System.out.println("Enter details of Person 1:");
	                    System.out.print("Name: ");
	                    String n1 = sc.nextLine();
	                    System.out.print("Age: ");
	                    int a1 = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Gender (MALE/FEMALE/OTHER): ");
	                    Gender gP1 = Gender.valueOf(sc.nextLine().toUpperCase());

	                    System.out.println("Enter details of Person 2:");
	                    System.out.print("Name: ");
	                    String n2 = sc.nextLine();
	                    System.out.print("Age: ");
	                    int a2 = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Gender (MALE/FEMALE/OTHER): ");
	                    Gender gP2 = Gender.valueOf(sc.nextLine().toUpperCase());

	                    st.push(new Person(n1, a1, gP1), new Person(n2, a2, gP2));
	                    break;

	                case 3:
	                    Person popped = st.pop();
	                    if (popped != null) {
	                        System.out.println("Popped Person:");
	                        popped.displayPerson();
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter number of Persons to pop: ");
	                    int n = sc.nextInt();
	                    st.pop(n);
	                    break;

	                case 5:
	                    st.display();
	                    break;

	                case 6:
	                    System.out.print("Enter number of top Persons: ");
	                    int topN = sc.nextInt();
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
	}
	
		
		  