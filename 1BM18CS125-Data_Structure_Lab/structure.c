#include<stdio.h>
#include<conio.h>
struct student
{
int id;
int age;
int marks;
}
s1;
int main()
{
clrscr();
printf("enter the student ID:");
scanf("%d",&s1.id);
printf("enter the age of the student:");
scanf("%d",&s1.age);
printf("enter the marks of the student:");
scanf("%d",&s1.marks);
if(s1.age<=20 &&s1.marks>=65)
printf("the student is eligible for admission");
else
printf("the student is not eligible for admission");
getch();
return 0;
}
