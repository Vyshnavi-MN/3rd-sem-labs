import java.util.*;
class WrongAge extends Exception{
    int age;
    WrongAge(int a){
        age = a;
    }
    public String toString(){
        return("Wrong Age [" + age + "]");
    }
}

class father{
    int fathers_age;
    father(int age){
        fathers_age = age;
    }
}

class son extends father{
    int son_age;
    son(int age1){
        super(age1);
    }
    void calculate() throws WrongAge{
        if(fathers_age <= 0){
            throw new WrongAge(fathers_age);
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter son's age ");
            son_age = sc.nextInt();
            if(fathers_age > son_age){
            System.out.println("Father's age is : " + fathers_age);
            System.out.println("Son's age is : " + son_age);
            }
            else{
                throw new WrongAge(son_age);
            }
        }
    }

    public static void main(String[] args) {
        try{
        int age1;
        System.out.println("Enter father's age ");
        Scanner sc = new Scanner(System.in);
        age1 = sc.nextInt();
        son s = new son(age1);
        s.calculate();
        }catch(WrongAge e){
            System.out.println(e);
        }
    }
}