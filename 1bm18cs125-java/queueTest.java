import java.util.*;
interface Iqueue{
    void enqueue(int item);
    int dequeue();
}

class dynamicQueue implements Iqueue{
    private int r = -1 , f = 0 , size , queue[];
    dynamicQueue(){

    } 
    dynamicQueue(int size){
        queue = new int[size];
        this.size = size;
    }
    public void enqueue(int item){
        if(r == queue.length - 1){
            int temp[] = new int[queue.length * 2];
            for(int i = 0 ; i < size ; i++){
                temp[i] = queue[i];
            }
            queue = temp;
            queue[++r] = item;
        }
        else{
            queue[++r] = item;
        }
    }

    public int dequeue(){
        if(f < 0){
            System.out.println("Queue underflow");
            return -1;
        }
        else{
            return queue[f++];
        }
    }

    void display(){
        if(f < 0 || f>r){
            System.out.println("Empty");
        }
        else{
            for(int i = f; i <= r ; i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

class queueTest extends dynamicQueue{
    public static void main(String args[]) {
        int size , ch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue");
        size = sc.nextInt();
        dynamicQueue ob = new dynamicQueue(size);
        while(ch != 4){
            System.out.println();
            System.out.println("Enter your choice 1.Insert an element 2.Delete an element 3.Display elements 4.Exit");
            ch = sc.nextInt();
            switch(ch){
                case 1: int item;
                        System.out.println("Enter item : ");
                        item = sc.nextInt();
                        ob.enqueue(item);
                        break;
                case 2: System.out.println("The element deleted is " + ob.dequeue());
                        break;
                case 3: ob.display();
                        break;
            }
        }       
    }
}