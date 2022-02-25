package Assignments;

// Assignment 3 - Siona Ravi

import java.util.Random;  

public class Account
{
       private double balance;
   private String name;
      private long acctNum;

     
  public Account(double initBal, String owner, long number)
 {
         balance = initBal;
                name = owner;
             acctNum = number;
 }

 public Account(double initBal, String owner)
      {
         balance = initBal;
                name = owner;
             acctNum = generateAccountNumber();
        }

  public Account(String owner)
      {
         balance = 0;
              name = owner;
             acctNum = generateAccountNumber();
        }

      public void withdraw(double amount)
       {
         if (balance >= amount)
                 balance -= amount;
                else
                      System.out.println("Insufficient funds");
 }

 
    public void withdraw(double amount, double fee)
   {
         double amountWithFee = amount + fee;

                if (balance >= amountWithFee)
                  balance -= amountWithFee;
         else
                      System.out.println("Insufficient funds");
 }

   
  public void deposit(double amount)
        {
         balance += amount;
        }


  public double getBalance()
        {
         return balance;
   }

  public String toString()
  {
         return "Name:" + name +
           "\nAccount Number: " + acctNum +
          "\nBalance: " + balance;
  }

  
        private long generateAccountNumber()
      {
         Random r = new Random();        

          return 10000 + r.nextInt(89999);       
       }
}