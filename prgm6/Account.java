package bank;

public class Account
{
	    private int accountNo;
	    private String name;
	    private double balance;

	    public Account(int accountNo, String name, double balance)
	    {
	        this.accountNo = accountNo;
	        this.name = name;
	        this.balance = balance;
	    }

	   
	    public void deposit(double amount)
	    {
	        if (amount <= 0) 
	        {
	            System.out.println("Deposit amount must be positive.");
	            return;
	        }
	        balance += amount;
	        System.out.println("Successfully deposited: " + amount);
	    }

	  
	    public void withdraw(double amount) throws InsufficientBalanceException 
	    {
	        if (amount < 0)
	        {
	            throw new ArithmeticException("Withdrawal amount cannot be negative.");
	        }
	        if (amount > balance) 
	        {
	            throw new InsufficientBalanceException("Insufficient balance! Available: " + balance);
	        }
	        balance -= amount;
	        System.out.println("Successfully withdrawn: " + amount);
	    }

	    public void showBalance()
	    {
	        System.out.println("Account No: " + accountNo + " | Name: " + name + " | Balance: " + balance);
	    }
	}

