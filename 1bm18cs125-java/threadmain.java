import java.util.*;
class mythread implements Runnable{
    Thread t;
    mythread(String name){
        t = new Thread(this , name);
        System.out.println("Thread " + name);
        t.start();
    }

    public void run(){
        try{
            for(int i = 0 ; i < 10 ; i++){
                Thread.sleep(1000);
                System.out.println("BMS College Of Engineering");
            }
        }catch(InterruptedException e){
            System.out.println("interrupted exception");
        }
    }
}

class threadmain{
    public static void main(String[] args) {
        mythread nt = new mythread("BMS Thread");
        try{
            for(int i = 0 ; i < 10 ; i++){
                System.out.println("CSE");
                Thread.sleep(200);
            }
        }catch(InterruptedException e){
            System.out.println("interrupted exception");
        }
    }
}