#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node*next;
};

struct Node * head=NULL;

struct Node* createNode(int data)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data=data;
    newNode->next=NULL;
    return newNode;
}

void display(){
    struct Node* current = head;
    if (current==NULL)
    {
        printf("\n'ERROR: List is empty'");
        return;
    }
    printf("Single Link List :");
    while (current!=NULL)
    {
        printf("%d -> ",current->data);
        current=current->next;
    }
    printf("NULL.\n");
}

void insertBeginList(int data){
    struct Node* NewNode = createNode(data);
    NewNode->next=head;
    head = NewNode;
    printf("Node inserted at beginning...!!");
}
void insertEndList(int data){
    struct Node* newNode = createNode(data);
    if (head==NULL) {
        head = newNode;
    }
    else{
       struct Node* current = head;
       while (current->next != NULL){
           current= current->next;
        }
        current->next = newNode;
    }
    printf("Node inserted...!!");
}
void insertBefore(int data, int key){
    struct Node * newNode = createNode(data);
    if (head==NULL){
        printf("The list is empty...!");
        return;
    }
    if(head->data==key){
        newNode->next = head;
        head=newNode;
        printf("Node inserted...!!");
        return;
    }
    struct Node* current = head;
    while (current->next!=NULL && current->next->data!=key)
    {
        current =  current->next;
    }
    if (current->next==NULL)
    {
        printf("Node not found...!!");
    }
    else{
        newNode->next=current->next;
        current->next=newNode;
        printf("Node inserted...!!");
    }
}
void insertAfter(int data,int key){
    struct Node * newNode = createNode(data);
    if (head==NULL){
        printf("The list is empty...!");
        return;
    }
    struct Node* current = head;
    while (current!=NULL && current->data!=key)
    {
        current =  current->next;
    }
    if (current==NULL)
    {
        printf("Node not found...!!");
    }
    else{
        newNode->next=current->next;
        current->next=newNode;
        printf("Node inserted...!!");
    }
}
void delBeginning(){
    if (head==NULL)
    {
        printf("No Node to delete...!!");
        return;
    }
    else{
        struct Node * current = head;
        head=current->next;
        free(current);
        printf("Node deleted...!!");
        return;
    }
}
void delEnd(){
    if (head==NULL)
    {
        printf("No Node to delete...!!");
        return;
    }
    if(head->next==NULL){
        free(head);
        head==NULL;
        printf("Head deleted...!!");
        return;
    }
    struct Node* current = head;
    while (current->next->next!=NULL)
    {
        current=current->next;        
    }
    free(current->next);
    current->next=NULL;
    printf("Node deleted from the end...!!");    
}
void delBefore(int key){
    if (head==NULL){
        printf("No Node to delete...!!");
        return;
    }
    if(head->data==key){
        printf("Can't delete any node...!!");
        return;
    }
    struct Node* current = head;
    while (current->next->next!=NULL && current->next->next->data!=key)
    {
        current =  current->next;
    }
    if (current->next->next==NULL)
    {
        printf("Node not found...!!");
    }
    else{
        struct Node* temp = current->next;
        current->next=current->next->next;
        free(temp);
        printf("Node deleted brfore %d...!!",key);
    }
}
void delAfter(int key){
    if (head==NULL){
        printf("No Node to delete...!!");
        return;
    }
    struct Node* current = head;
    while (current!=NULL && current->data!=key)
    {
        current =  current->next;
    }
    if (current->next==NULL || current == NULL)
    {
        printf("Node not found...!!");
    }
    else{
        struct Node* temp = current->next;
        current->next=current->next->next;
        free(temp);
        printf("Node deleted after %d...!!",key);
    }
}
void delentire(){
    struct Node* current = head;
    while (current!=NULL)
    {
        struct Node* temp = current;
        current=current->next;
        free(temp);
    }
    head = NULL;
    printf("Entire single link list is deleted....!!");
}

int main(){
    int choice,data,key;

    do {
        printf("\n\n**//--Menu--//**\n\n");
        printf("1. Create a single linked list\n");
        printf("2. Display the elements of the linked list\n");
        printf("3. Insert a node at the beginning\n");
        printf("4. Insert a node at the end\n");
        printf("5. Insert a node before a given node\n");
        printf("6. Insert a node after a given node\n");
        printf("7. Delete a node from the beginning\n");
        printf("8. Delete a node from the end\n");
        printf("9. Delete a node before a given node\n");
        printf("10. Delete a node after a given node\n");
        printf("11. Delete the entire linked list\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            printf("Enter the data for the first Node : ");
            scanf("%d", &data);
            head = createNode(data);            
            break;
        case 2:
            printf("Link list Elements : ");
            display();        
            break; 
        case 3: 
            printf("Enter the data to insert at beginning : ");
            scanf("%d",&data);
            insertBeginList(data);
            break;
        case 4:
            printf("Enter the data to insert at End : ");
            scanf("%d",&data);
            insertEndList(data);
            break;
        case 5:
            printf("Enter data to insert before the node: ");
            scanf("%d", &data);
            printf("Enter the key: ");
            scanf("%d", &key);
            insertBefore(data,key);
            break;
        case 6:
            printf("Enter data to insert after the  node: ");
            scanf("%d", &data);
            printf("Enter the key: ");
            scanf("%d", &key);
            insertAfter(data,key);
            break;
        case 7:
            delBeginning();
            break;
        case 8:
            delEnd();
            break;
        case 9:
            printf("Enter the key to delete forom before a node: ");
            scanf("%d", &key);
            delBefore(key);
            break;
        case 10 :
            printf("Enter the key to delete after a node: ");
            scanf("%d", &key);
            delAfter(key);
            break;
        case 11:
            delentire();
            break;          
        case 0 :
            printf("Exiting...!!");
            break;
        default:
            printf("Invalid choice!\n");
            break;
        }

    }while(choice!=0);

    return 0;
}