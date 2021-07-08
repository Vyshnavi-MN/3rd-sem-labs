import cie.*;
import see.*;
import java.util.*;
class packageDemo{
    public static void main(String []args){
        external list[] = new external[2];
        for(int i = 0 ; i < 5 ; i++){
            System.out.println();
            list[i] = new external();
            System.out.println("Enter Details of Student "+ (i+1) + ":");
            list[i].getDetails();
            System.out.println();
            System.out.println("Enter CIE Marks :");
            list[i].getCieMarks();
            System.out.println();
            System.out.println("Enter SEE Marks :");
            list[i].getSeeMarks();
            System.out.println();
            list[i].displayDetails();
            list[i].putData();
        }
    }
}