import java.util.*;
class gene<T>
{
  T ob;
  gene(T ob){
    this.ob = ob;
  }

  T ret(){
    return ob;
  }

  void showtype(){
    System.out.println("The type of T is " + ob.getClass().getName());
  }
}

class gendemo{
  public static void main(String args[])
  {
    gene<Integer> g = new gene<Integer>(100);
    int x = g.ret();
    System.out.println(x);
    g.showtype();
    gene<String> s = new gene<String>("Generics with mutiple onjects");
    String s1 = s.ret();
    System.out.println();
    System.out.println(s1);
    s.showtype();
  }
}
