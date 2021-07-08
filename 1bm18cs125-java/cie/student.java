/*Create a package CIE which has two classes- Student and Internals. 
The class Student has members like usn, name, sem. 
The class Internals has an array that stores the internal marks scored in five courses of the current semester of the student. 
Create another package SEE which has the class External which is a derived class of Internals. This class has an array that stores 
the SEE marks scored in five courses of the current semester of the student. Import the two packages in a file that declares the final marks of n students in all five courses.*/

package cie;
import java.util.*;
public class student{
    public String usn , name , sem;
    student(){}
    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = sc.next();
        System.out.println("Enter usn : ");
        usn = sc.next();
        System.out.println("Enter sem : ");
        sem = sc.next();
    }
    public void displayDetails(){
        System.out.println("Name of Student : " + name);
        System.out.println("Usn of Student : " + usn);
        System.out.println("Semester of Student : " + sem);
    }
}