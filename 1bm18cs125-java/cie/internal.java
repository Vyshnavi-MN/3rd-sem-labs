package cie;
import java.util.*;
public class internal extends student{
    public double cie_marks[] = new double[5];
    Scanner sc = new Scanner(System.in);
    public void getCieMarks(){
        for(int i = 0; i < 5 ; i++){
            System.out.println("Enter the cie marks of student in subject " + (i+1) + ":");
            cie_marks[i] = sc.nextDouble();
        }
    }
}