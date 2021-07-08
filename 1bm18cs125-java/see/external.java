package see;
import cie.internal;
import java.util.*;
public class external extends internal{
    public double see_marks[] = new double[5];
    Scanner sc = new Scanner(System.in);
    public void getSeeMarks(){
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println("Enter the see marks of student in subject " + (i+1) + ":");
            see_marks[i] = sc.nextDouble();
        }
    }
    public void putData(){
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println("Final marks of student " + i + ": " + (cie_marks[i] + see_marks[i]));
        }
    }
}