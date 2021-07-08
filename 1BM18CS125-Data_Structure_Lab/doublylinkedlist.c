/******************************************************************************

            WAP Implement doubly link list with primitive operations
a) Create a doubly linked list.
b) Insert a new node to the left of the node.
c) Delete the node based on a specific value
d) Display the contents of the list

*******************************************************************************/
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct Node{
    int value;
    struct Node *leftLink;
    struct Node *rightLink;
};
typedef struct Node *node;

node getNode(node first , int item){
    node temp;
    temp = (node)malloc(sizeof(struct Node));
    temp->value = item;
    temp->leftLink = NULL;
    temp->rightLink = NULL;
    return temp;
}

node insert(node first , int item){
    node temp , curr;
    temp = getNode(first , item);
    if(first == NULL){
        return temp;
    }
    else{
      curr = first;
      while(curr->rightLink != NULL){
          curr = curr->rightLink;
      }
      temp->leftLink = curr;
      curr->rightLink = temp;
      return first;
    }
}

node insertPosition(node first , int item , int pos){
    int count = 1;
    node temp;
    temp = getNode(first , item);
    if(first == NULL){
        printf("\nEmpty\n");
        return temp;
    }
    else if(first->rightLink == NULL && pos != 1){
        printf("Invalid choice\n");
        return first;
    }
    else{
        node curr;
        curr = first;
        while(curr->rightLink == NULL && count != pos){
            curr = curr->rightLink;
            count++;
        }
        if(count == pos){
            temp->leftLink = curr;
            temp->rightLink = curr->rightLink;
            curr->rightLink = temp;
            curr->rightLink->leftLink = temp;
        }
        return first;
    }
}

/*node deleteElement(node first , int item){
    node curr , temp;
    curr = first;
    if(first == NULL){
        printf("\nEmpty\n");
        return first;
    }
    else if(first->rightLink == NULL && first->value == item){
        printf("Deleted element is %d\n",first->value);
        free(first);
        return NULL;
    }
    else{
      while(curr != NULL && curr->value != item){
        curr = curr->rightLink;
      }
      if(curr->value == item){
        temp = curr;
        curr->leftLink->rightLink = temp->rightLink;
        curr->rightLink->leftLink = temp->leftLink;
        printf("Deleted element is %d\n",temp->value);
        free(temp);
        return first;
      }
      else{
          printf("Element not found\n");
          return first;
      }
    }
}*/
node deleteElement(node head,int ele) {
	node temp=head;
	if(head==NULL) {
		printf("Empty\n");
	}
  else {
		while(temp->value!=ele && temp->rightLink!=NULL)
		{
			temp=temp->rightLink;
		}
		if(temp->value==ele && temp->rightLink==NULL) {
			printf("%d deleted \n",temp->value);
			head = NULL;
			free(temp);
		}
	else if(temp->value!=ele && temp->rightLink==NULL)
		{
 			printf("Invalid\n");
		}
	else if(temp->value==ele && temp->leftLink==NULL) {
		printf("%d deleted \n",temp->value);
		head=temp->rightLink;
		(temp->rightLink)->leftLink=NULL;
		free(temp);
	}
	else {
		 printf("%d deleted \n",temp->value);
		(temp->leftLink)->rightLink = temp->rightLink;
		(temp->rightLink)->leftLink = temp->leftLink;
		free(temp);
	}
   }
	return head;
}


void display(node first){
    printf("Elements in the list are : ");
    node curr;
    curr = first;
    while(curr != NULL){
        printf("%d ",curr->value);
        curr = curr->rightLink;
    }
}

int main(){
    int ch , item , position;
    node first = NULL;
    while(ch != 5){
        printf("\n\n1.Insert\n2.Insert element at given position\n3.Delete the given element\n4.Display the elements\n5.Exit\nEnter your choice : ");
        scanf("%d" , &ch);
        switch(ch){
            case 1 : printf("\nEnter the element to be inserted : ");
                     scanf("%d" , &item);
                     first = insert(first , item);
                     printf("\nElement Inserted\n");
                     break;
            case 2 : printf("\nEnter the element to be inserted : ");
                     scanf("%d" , &item);
                     printf("\nEnter the position to be inserted : ");
                     scanf("%d" , &position);
                     first = insertPosition(first , item , position);
                     printf("\nElement Inserted\n");
                     break;
            case 3 : printf("\nEnter the element to be deleted : ");
                     scanf("%d" , &item);
                     first = deleteElement(first , item);
                     break; 
            case 4 : display(first);
                     break;
            default : printf("\nInvalid choice\n");
                      break;
        }
    }
}
