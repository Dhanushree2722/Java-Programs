package source;
public class Main
{ 
public static void main(String[] args) 
{ 
Bank bank = new Bank(); 
bank.createAccount(1003, 3000); 
bank.createAccount(1004, 1000); 
bank.deposit(1003, 2000); 
bank.withdraw(1004, 300); 
System.out.println("Final balances:"); 
bank.checkBalance(1003); 
bank.checkBalance(1004); 
} 
}  