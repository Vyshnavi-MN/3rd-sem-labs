/*2. Create an abstract class Accounts  in a Package called DataBank with the following details:
Date members: a)balance b) accountNumber c) accountHolderName  d)address
Methods: a)withdrawl( ) --abstract b)deposit( ) --abstract c)display( ) to show the balance of the account number.
Create a subclass of this class SavingAccount in another package SAVINGS and add the following details:
Data members: a) rateOfInterest 
Methods: a)calculateAmount( ) b) display() to display rate of interest with new balance and full account holder details.
Create a Employee class in another package, which will make a object reference of SavingAccount class and use all functionality of that class*/

package savings;
import dataBank.Accounts;
import java.util.*;
public class SavingAccount extends Accounts{
    public double rateOfInterest;
    public void getDetails(){
        super.getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rate Of Interest : ");
        rateOfInterest = sc.nextDouble();
    }
    public void withdrawl(double amt){
        balance -= amt; 
    }
    public void deposit(double amt){
        balance += amt;
    }
    public void calculateAmount(){
        balance += ((balance*rateOfInterest)/100) ;  
    }
    public void display(){
        super.display();
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Address : " + address);
        System.out.println("Updated Balance : " + balance);
    }
}