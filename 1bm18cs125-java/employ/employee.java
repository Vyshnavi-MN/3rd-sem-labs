/*2. Create an abstract class Accounts  in a Package called DataBank with the following details:
Date members: a)balance b) accountNumber c) accountHolderName  d)address
Methods: a)withdrawl( ) --abstract b)deposit( ) --abstract c)display( ) to show the balance of the account number.
Create a subclass of this class SavingAccount in another package SAVINGS and add the following details:
Data members: a) rateOfInterest 
Methods: a)calculateAmount( ) b) display() to display rate of interest with new balance and full account holder details.
Create a Employee class in another package, which will make a object reference of SavingAccount class and use all functionality of that class*/

package employ;
import java.util.*;
import savings.SavingAccount;
public class employee extends SavingAccount{
    
}