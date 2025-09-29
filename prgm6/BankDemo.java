package bank;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(27, "Dhanushree", 22000);

        while (true) {
            System.out.println("\n****** Banking System Menu ******");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        acc.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        try {
                            acc.withdraw(withdrawAmount);
                        } catch (InsufficientBalanceException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 3:
                        acc.showBalance();
                        break;

                    case 4:
                        System.out.println("Thank you for using our Banking System!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice! Please enter 1–4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numeric values only.");
                sc.nextLine(); 
            } catch (ArithmeticException e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}