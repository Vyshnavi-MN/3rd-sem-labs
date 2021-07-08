/*2. Create an abstract class Accounts  in a Package called DataBank with the following details:
Date members: a)balance b) accountNumber c) accountHolderName  d)address
Methods: a)withdrawl( ) --abstract b)deposit( ) --abstract c)display( ) to show the balance of the account number.
Create a subclass of this class SavingAccount in another package SAVINGS and add the following details:
Data members: a) rateOfInterest 
Methods: a)calculateAmount( ) b) display() to display rate of interest with new balance and full account holder details.
Create a Employee class in another package, which will make a object reference of SavingAccount class and use all functionality of that class*/

package dataBank;
import java.util.*;
public abstract class Accounts{
    public String accountNumber , accountHolderName , address;
    public double balance;
    Scanner sc = new Scanner(System.in);
    public void getDetails(){
        System.out.println("Enter Account Holder Name : ");
        accountHolderName = sc.next();
        System.out.println("Enter Account Number : ");
        accountNumber = sc.next();
        System.out.println("Enter Address : ");
        address = sc.next();
        System.out.println("Enter Balance : ");
        balance = sc.nextDouble();
    }
    public abstract void withdrawl(double amt);
    public abstract void deposit(double amt);
    public void display(){
        System.out.println("Balance amount : " + balance);
    } 
}