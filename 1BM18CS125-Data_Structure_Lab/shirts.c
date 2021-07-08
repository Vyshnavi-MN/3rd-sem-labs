/*
 * C program to implement stack to manage Peter's shirts in to a cupboard
 * Stack operations: PUSH(insert operation), POP(Delete operation) and Display stack.
 */
#include <stdio.h>
#define MAXSIZE 20
 
struct shirts
{
    int stack[MAXSIZE];
    int top;
};
typedef struct shirts STACK1;
STACK1 peterShirts;
 
int push(void);
int  pop(void);
void display(void);
 
void main ()
{
    int choice;
    peterShirts.top = -1;
 
    printf ("STACK OPERATION\n");
    printf ("      1    -->    PUSH\n");
    printf ("      2    -->    POP\n");
    printf ("      3    -->    DISPLAY\n");
    printf ("      4    -->    EXIT\n");
 
    printf ("Enter your choice\n");
    scanf    ("%d", &choice);
    switch (choice)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            display();
            break;
        case 4:
            printf("Invalid Choice");
            break;
        }
}
//  Function to add a shirt to the stack 
int push ()
{
    int numberOfShirts;
    if (peterShirts.top == (MAXSIZE - 1))
    {

        printf ("Stack is Full\n");
    }
    else
    {
        printf ("Enter the shirt to be pushed\n");
        scanf ("%d", &numberOfShirts);
        peterShirts.top = peterShirts.top + 1;
        peterShirts.stack[peterShirts.top] = numberOfShirts;
    }
    return(numberOfShirts);
    display();
}
//  Function to delete a shirt from the stack 
int pop ()
{
    int numberOfShirts;
    if (peterShirts.top == - 1)
    {
        printf ("Stack is Empty\n");
        return (peterShirts.top);
    }
    else
    {
        numberOfShirts = peterShirts.stack[peterShirts.top];
        printf ("poped element is = %dn", peterShirts.stack[peterShirts.top]);
        peterShirts.top = peterShirts.top - 1;
    }
    return(numberOfShirts);
    display();
}
//  Function to display the status of the stack 
void display ()
{
    int i;
    if (peterShirts.top == -1)
    {
        printf ("Stack is empty\n");
    }
    else
    {
        printf (" The status of the stack is \n");
        for (i = 0; i < peterShirts.top; i++)
        {
            printf ("%d\n", peterShirts.stack[i]);
        }
    }
    printf ("\n");
}


