#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define size 3
int top=-1,stack[size];
void push();
void pop();
void display ();

void main()
{
int ch;

while(1)
{
printf("Stack Menu\n");
printf("1-push\n2-pop\n3-display\n4-exit\n");
printf("Enter the choice from 1-4\n");
scanf("%d", &ch);

switch(ch)
{
case 1: push();
	break;
case 2: pop();
	break;
case 3: display();
	break;
case 4: exit(0);
default: printf("Invalid choice\n");
}
}
}

void push()
{
int item;
if(top>=size-1)
{
printf("Stack overflow\n");
}
else
{
printf("Enter the element to be inserted\n");
scanf("%d", &item);
top=top+1;
stack[top]=item;
}
}

void pop()
{
if(top<0)
{
printf("Stack underflow\n");
}
else
{
printf("The element deleted is %d\n",stack[top]);
top--;
}
}

void display()
{
int i;
printf("The elements in stack :\n");
for(i=top;i>=0;i--)
{
printf("%d\n",stack[i]);
}
}







