import dataBank.*;
import savings.*;
import employ.*;
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch =0;
        double amount;
        SavingAccount list = new SavingAccount();
        list.getDetails();
        while(ch != 4){
            System.out.println("Enter your choice 1.Withdrawl 2.Deposit 4.Exit");
            ch = sc.nextInt();
            switch(ch){
            case 1 : System.out.println("Enter Amount to be withdrawn :");
                    amount = sc.nextDouble();
                    list.withdrawl(amount);
                     break;
            case 2 : System.out.println("Enter Amount to be deposited :");
                    amount = sc.nextDouble();
                    list.deposit(amount);
                    break;
                }
            }
        list.calculateAmount();
        list.display();
    }
}