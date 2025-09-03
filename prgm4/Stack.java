package source;

public class Stack
{
	private Person[] arr;
	private int top;
	private int capacity;

		    // constructor 1
		    Stack(int size) {
		        capacity = size;
		        arr = new Person[capacity];
		        top = -1;
		    }
        //constructor2
		    Stack(Person[] inputArr) {
		        capacity = inputArr.length;
		        arr = new Person[capacity];
		        top = -1;
		        for (Person p : inputArr) {
		            push(p);
		        }
		    }

		   // used to push 1person
		    void push(Person p) {
		        if (top == capacity - 1) {
		            System.out.println("Stack Overflow! Cannot push more Persons.");
		            return;
		        }
		        arr[++top] = p;
		        System.out.println("Pushed:");
		        p.displayPerson();
		    }

		    // Overload push i.e push two person
		    void push(Person p1, Person p2) {
		        push(p1);
		        push(p2);
		    }
// used to pop single person
		    Person pop() {
		        if (top == -1) {
		            System.out.println("Stack Underflow! No Persons to pop.");
		            return null;
		        }
		        Person p = arr[top--];
		        System.out.println("Popped:");
		        return p;
		    }

		    //Overloading used to pop n persons
		    void pop(int n) {
		        if (n > top + 1) {
		            System.out.println("Stack Underflow! Only " + (top + 1) + " Persons in stack.");
		            return;
		        }
		        System.out.println("Popped Persons:");
		        for (int i = 0; i < n; i++) {
		            Person p = pop();
		            if (p != null)
		                p.displayPerson();
		        }
		    }

		    // Display all Persons in screen
		    void display() {
		        if (top == -1) {
		            System.out.println("Stack is empty.");
		            return;
		        }
		        System.out.println("Stack contents:");
		        for (int i = top; i >= 0; i--) {
		            arr[i].displayPerson();
		        }
		    }

		   //display n persons
		    void display(int n) {
		        if (top == -1) {
		            System.out.println("Stack is empty.");
		            return;
		        }
		        if (n > top + 1) {
		            System.out.println("Only " + (top + 1) + " Persons available in stack. Displaying all.");
		            n = top + 1;
		        }
		        System.out.println("Top " + n + " Persons:");
		        for (int i = top; i > top - n; i--) {
		            arr[i].displayPerson();
		        }
		    }
		}

