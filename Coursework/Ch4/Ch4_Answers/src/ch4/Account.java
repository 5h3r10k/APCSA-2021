package ch4;

import java.text.DecimalFormat;
import java.text.NumberFormat;



public class Account { 
    
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    private DecimalFormat round = new DecimalFormat(".00");

    private final double RATE = 0.035; // interest rate of 3.5%
    
    private long acctNumber; private double balance; private String name;
    
    //----------------------------------------------------------------
    // Sets up the account by defining its owner, account number,
    // and initial balance. 
    //----------------------------------------------------------------
    
    public Account (String owner, long account, double initial){
        name = owner; 
        acctNumber = account; 
        balance = initial;
    }

    //----------------------------------------------------------------
    // Validates the transaction, then deposits the specified amount 
    // into the account. Returns the new balance. 
    //-----------------------------------------------------------------

    public double deposit (double amount) {

        if (amount < 0) { // deposit value is negative
        
            System.out.println ();

            System.out.println ("Error: Deposit amount is invalid.");
            
            System.out.println (acctNumber + " " + fmt.format(amount)); 
        
        } else {

            balance = balance + amount;

        }
        
        return balance;
        
    }

    //----------------------------------------------------------------
    // Validates the transaction, then withdraws the specified amount 
    // from the account. Returns the new balance. 
    //-----------------------------------------------------------------

    public double withdraw (double amount, double fee) { 
        
        amount += fee;

        if (amount < 0) // withdraw value is negative
        { 

            System.out.println (); 
            System.out.println ("Error: Withdraw amount is invalid."); 
            System.out.println ("Account: " + acctNumber); 
            System.out.println ("Requested: " + fmt.format(amount)); 

        } else {
            
            if (amount > balance) // withdraw value exceeds balance
            { 
                System.out.println (); 
                System.out.println ("Error: Insufficient funds.");
                System.out.println ("Account: " + acctNumber); 
                System.out.println ("Requested: " + fmt.format(amount)); 
                System.out.println ("Available: " + fmt.format(balance));

            } else {
                balance = balance - amount;
            }

        }

        return balance;
    }

    //----------------------------------------------------------------
    // Adds interest to the account and returns the new balance. 
    //-----------------------------------------------------------------
    public double addInterest () {

        balance += (balance * RATE);
        return Double.parseDouble(round.format(balance)); 
    
    }

    //----------------------------------------------------------------
    // Transfers money from one account to the other
    // Basically a withdraw from one and a deposit to the other
    //----------------------------------------------------------------
    public void transfer(Account target,double transferAmount,double transferFee){

        System.out.println("Transferring from "+this.name+" to "+target.name);

        if((transferAmount+transferFee)<=balance){
            withdraw(transferAmount, transferFee);
            target.deposit(transferAmount);
        }else{
            System.out.println("Insufficient funds.");
        }

    }

    //----------------------------------------------------------------
    // Returns the current balance of the account. 
    //-----------------------------------------------------------------
    public double getBalance () { 
        return Double.parseDouble(round.format(balance));
    }

    //----------------------------------------------------------------
    // Returns the account number. 
    //-----------------------------------------------------------------
    public long getAccountNumber () { 
        return acctNumber; 
    }

    public boolean equals(Account target){
        return this.getBalance() == target.getBalance();
    }

    //----------------------------------------------------------------
    // Returns a one-line description of the account as a string. 
    //-----------------------------------------------------------------
    public String toString () { 
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance)); 
    }


}