#include<stdio.h>
#include<stdlib.h>
#define n 5
int enqueue(int *queue[n],int *rear,int *x);
int dequeue(int *queue[n],int *front,int *rear,int *x);
int display(int *queue[n],int *front,int *rear);
void main()
{
    int queue[n],ch,front=0,rear=0,i,x=n;
    printf("Queue using Array");
    printf("\n1.Insertion \n2.Deletion \n3.Display \n4.Exit\n");
    while(1)
    {
        printf("\nEnter the Choice:");
        scanf("%d",&ch);
        switch(ch)
        {
        case 1:
            enqueue (queue,&rear,&x);
            break;
        case 2:
            dequeue(queue,&front,&rear,&x);
            break;
        case 3:
            display(queue,&front,&rear);
            break;
        case 4: exit(0);
        default:
            printf("Wrong Choice: please see the options");
        }
    }
}

int enqueue(int *queue[n],int *rear,int *x)
{
    int item;
    if(*rear == *x)
    {
        printf("\n Queue is Full");
        return 0;
    }
    else
    {
        printf("\n Enter element to be added :");
        scanf("%d",&item);
        queue[*rear]=item;
        *rear = *rear +1;
        return 0;
    } 
}

int dequeue(int *queue[n],int *front,int *rear,int *x)
{
    if(*front == *rear)
    {
        printf("\n Queue is empty");
        return 0;
    }
    else
    {
        printf("\n Deleted Element is %d",queue[*front]);
        *front = *front + 1;
        *x = *x + 1;
        return 0;
    }
}

int display(int *queue[n],int *front,int *rear)
{
    int i;
    printf("\n Queue Elements are:\n ");
    if(*front == *rear)
    {
        printf("\n Queue is Empty");
        return 0;
    }
    else
    {
        for(i=*front; i<*rear; i++)
        {
            printf("%d",queue[i]);
            printf("\n");
        }
    return 0;
    }
}
