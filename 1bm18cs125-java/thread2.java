import java.util.*;
class Main{
    public static void main(String[] args) {
        int array[] = {3, 2, 7, 5, 2, 5};
        int array1[] = {3, 2, 7, 5, 2, 5};


        myThread obj = new myThread(array1, array.length);
        for(int i = 0; i< array.length; i++){
            for(int j =i+1; j<array.length;j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i] ;
                    array[i] = temp;
                }
            }
        }
        System.out.println("The ascending list is ");
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
        
        
    }
}


class myThread implements Runnable{
    int a[];
    int l;
    myThread(int array1[], int length){
        l= length;
        //a = new int[l];
        a = array1;
        Thread t =new Thread(this);
        t.start();
    }

    public void run(){
        
        System.out.println("-------------------------------"+a[0]);
        for(int i = 0; i< l; i++){
            for(int j =i+1; j<l;j++){
                if(a[j]>a[i]){
                    int temp = a[j];
                    a[j] = a[i] ;
                    a[i] = temp;
                }
            }
        }
        System.out.println("The Descending list is ");
        for(int i = 0; i<l;i++){
            System.out.println(a[i]);
        }
    }
}