package bank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InsufficientBalanceException extends Exception
{
	    public InsufficientBalanceException(String message) 
	    {
	        super(message);
	    }
	}

