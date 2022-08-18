//**********************************************
// TestAccounts2
// A simple program to test the closing and consolidation
// features of the Account class.
//**********************************************
import java.util.Scanner;

public class TestAccounts1
{
    public static void main(String[] args)
    {
	String name;
	Account acct1, acct2, acct3;
	Scanner scan = new Scanner(System.in);

	//Create first account
	System.out.print("\nEnter name for first account: ");
	name = scan.next();
	acct1 = new Account(500, name);
	System.out.println("Created account for " + name + " with balance $100.");

	//Create second account
	System.out.print("\nEnter name for second account: ");
	name = scan.next();
	acct2 = new Account(500, name);
	System.out.println("Created account for " + name + " with balance $100.");

	//Create third account
	System.out.print("\nEnter name for third account: ");
	name = scan.next();
	acct3 = new Account(500, name);
	System.out.println("Created account for " + name + " with balance $100.");
	//Close first account
	System.out.println("Closing first account.");
	acct1.close();

	//Print number of accounts
	System.out.println("Number of accounts is now " + Account.getNumberOfAccounts ());
    }
}
