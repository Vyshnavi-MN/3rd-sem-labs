import java.util.*;
class thread1 extends Thread{
    int num;
    thread1(int a){
        num = a;
        this.start();
    }

    public void run(){
        try{
            if(num <= 5){
                thread1 t = new thread1((num+1));
                this.sleep(5000/num);
                System.out.println("HEllo from thread " + num);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class demoThread{
    public static void main(String[] args) {
        thread1 t = new thread1(1);
    }
}