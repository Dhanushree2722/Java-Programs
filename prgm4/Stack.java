package books;

public class Stack 
{
	private int a[]; 
    private int top; 
    private int cap;
    Stack(int size) { 
        cap = size; 
        a = new int[cap]; 
        top = -1; 
    } 
 
    Stack(int[] inputa) { 
        cap = inputa.length; 
        a = new int[cap]; 
        for (int i = 0; i < cap; i++) { 
            a[i] = inputa[i]; 
        } 
        top = cap - 1; 
    } 
 
    void push(int x) { 
        if (top >= cap - 1) { 
            System.out.println("Stack Overflow" + x); 
            return; 
        } 
        a[++top] = x; 
        System.out.println("Pushed: " + x); 
    } 
 
    void push(int x, int y) { 
        push(x); 
        push(y); 
    }
    int pop() { 
        if (top == -1) { 
            System.out.println("Stack Underflow"); 
            return -1; 
        } 
        return a[top--]; 
    } 
 
    void pop(int n) { 
        if (n <= 0) { 
            System.out.println("Invalid number of elements to pop"); 
            return; 
        } 
 
        for (int i = 0; i < n; i++) { 
            int val = pop(); 
            if (val == -1) break; 
            System.out.println("Popped: " + val); 
        } 
    } 
 
    void display() { 
        if (top == -1) { 
            System.out.println("Stack is empty"); 
            return; 
        } 
 
        System.out.println("Stack contents (Top to Bottom):"); 
        for (int i = top; i >= 0; i--)
        {
        	 System.out.println(a[i]);
        }
}
    void display(int n) { 
        if (top == -1) { 
            System.out.println("Stack is empty"); 
            return; 
        } 
 
        if (n <= 0) { 
            System.out.println("Invalid number of elements"); 
            return; 
        } 
 
        System.out.println("Top " + n + " elements:"); 
        for (int i = top; i >= 0 && i > top - n; i--) { 
            System.out.println(a[i]); 
        } 
    } 
} 
