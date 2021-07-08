import java.util.*;
class sgpamain
{
  public static void main(String args[])
  {
    sgpa s1= new sgpa();
    s1.acceptin();
    s1.calculate();
    s1.display();
  }
}

class sgpa
{
  int n,totalCredits;
  int credits[];
  int marks[];
  int gradePoints[];  
  double sgpa ;
  String name , usn;

  sgpa()
  {
    /*n = 0;
    credits = [0];
    marks = [0];
    gradePoints = [0];
    sgpa = 0.0; */
  }

  void acceptin()
  {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter Name, USN of the student and number of Subjects");
    name = s.next();
    usn = s.next();
    n = s.nextInt();
    credits = new int[n];
    marks = new int[n];
    gradePoints = new int[n];  
  }

  void calculate()
  {
    int i, totalCredits = 0 , sum = 0;
    Scanner s2 = new Scanner(System.in);
    System.out.println("Enter the marks and grade points in each subject");
    for(i=0;i<n;i++)
    {
      marks[i] = s2.nextInt();
      credits[i] = s2.nextInt();
      if(marks[i]>=90 && marks[i]<=100)
      {
        gradePoints[i] = 10;
      }
      else if(marks[i]>=75 && marks[i]<90)
      {
        gradePoints[i] = 9;
      }
      else if(marks[i]>=60 && marks[i]<75)
      {
        gradePoints[i] = 8;
      }
      else if(marks[i]>=50 && marks[i]<60)
      {
        gradePoints[i] = 7;
      }
      else if(marks[i]>=40 && marks[i]<50)
      {
        gradePoints[i] = 6;
      }
      else if(marks[i]<40)
      {
        gradePoints[i] = 0;
      }
      totalCredits = totalCredits + credits[i];
      sum = sum + ( gradePoints[i] * credits[i] );
    }
    System.out.println(totalCredits);
    sgpa = sum / totalCredits ;
}

void display()
{
System.out.println("SGPA of" + name + " " + "and" + " " + usn + " " + "is" + " " + sgpa);
}
}















