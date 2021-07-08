import java.util.*;
class bookmain
{
  public static void main(String args[])
  {
    int n;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of books");
    n = s.nextInt();
    book b[] = new book[n];
    for(int i=0; i<n; i++)
    {
      b[i] = new book();
      b[i].getData();
      System.out.println(b[i].toString());
    }
  }
} 

class book
{
  String name, author ;
  double price, pages ;
  
  book()
  {
  }

  void getData()
  { 
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter the book name , author , price and pages"); 
    name = s1.nextLine();
    author = s1.nextLine();
    price = s1.nextDouble();
    pages = s1.nextDouble();
  }

  public String toString()
  {
    return ("Name : " +name +"\n"+ "Author : "+author+"\n"+ "Price :" +price+"\n"+ "Number Of Pages : "+ pages +"\n");
  }
}
    










