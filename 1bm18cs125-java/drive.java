import java.util.*;
interface safe_driving{
    int safe_speed = 60;
    void speed_of_vehicle(int a);
}

class drive implements safe_driving{
    public void speed_of_vehicle(int speed){
        if(speed <= safe_speed){
            System.out.println("Safe driving");
        }
        else{
            System.out.println("Go slow");
        }
    }
    public static void main(String args[]) {
        int speed;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed");
        speed = sc.nextInt();
        safe_driving ob = new drive();
        ob.speed_of_vehicle(speed);
    }
}

