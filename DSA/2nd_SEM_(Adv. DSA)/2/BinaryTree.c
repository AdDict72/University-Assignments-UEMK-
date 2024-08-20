/*
Write a C program to create a binary tree using recursive function and display that level wise.
Write a C program to identify the height of a binary tree.
Write a C program to identify degree of a given node.
Write a C program to count number of leaf node present in a binary tree.
Write a C program to count number of internal node present in a binary tree.
Write a C program to count number of node present in a given binary tree using linked list.
Write a C program to count number of node present in a given binary tree using array.
Write a C program to count number of siblings present in a binary tree.*/

#include<stdio.h>
#include<stdlib.h>
#include<math.h>

struct TreeNode
{
    int data;
    struct TreeNode * left;
    struct TreeNode * right;
};

struct TreeNode *createNode(int data){
    struct TreeNode *newNode = malloc(sizeof(struct TreeNode));
    newNode->data=data;
    newNode->left=NULL;
    newNode->right=NULL;
    return newNode;
}

struct TreeNode *insert(struct TreeNode *root, int data){
    if(root==NULL){
        root = createNode(data);
    }
    else{
        if(data<=root->data){
            root->left = insert(root->left,data);
        }
        else{
            root->right = insert(root->right,data);
        }
    }
    return root;
}

void levelOrderTraversal(struct TreeNode *root){
    if(root == NULL){
        return;
    }
    struct TreeNode *queue[100];
    int front = -1, rear = -1;
    queue[++rear] = root;

    while (front != rear)
    {
        struct TreeNode *temp =queue[++front];
        printf("%d ",temp->data);

        if(temp->left != NULL){
            queue[++rear] = temp->left;
        }
        if(temp->right!=NULL){
            queue[++rear]=temp->right;
        }
    }
}

int treeHeight(struct TreeNode*root){
    if (root==NULL)
    {
        return 0;
    }
    else{
        int leftH=treeHeight(root->left);
        int rightH=treeHeight(root->right);
        return (leftH>rightH) ? (leftH+1) : (rightH+1) ;
    }
}

int nodeDegree(struct TreeNode * root, int key){
    if (root ==NULL)
    {
        return -1;
    }
    if(root->data == key){
        int degree=0;
        if (root->left!=NULL)
        {
            degree++;
        }
        if (root->right!=NULL)
        {
            degree++;
        }
        return degree;
    }
    else {
        int leftD = nodeDegree(root->left,key);
        int rightD = nodeDegree(root->right,key);
        if (leftD!=-1){
            return leftD;
        }
        else{
            return rightD;
        }      
    }
}

int countLeaf(struct TreeNode * root){
    if (root==NULL)
    {
        return 0;
    }
    if (root->left == NULL && root->right == NULL)
    {
        return 1;
    }
    return countLeaf(root->left)+countLeaf(root->right);   
}

int countInternalNodes(struct TreeNode *root)
{
    if (root == NULL || (root->left == NULL && root->right == NULL))
    {
        return 0;
    }
    return 1 + countInternalNodes(root->left) + countInternalNodes(root->right);
}

int countNodesLinkedList(struct TreeNode *root)
{
    if (root == NULL)
    {
        return 0;
    }
    return 1 + countNodesLinkedList(root->left) + countNodesLinkedList(root->right);
}

int countNodesArray(struct TreeNode *arr[], int size)
{
    int count = 0;
    for (int i = 0; i < size; i++)
    {
        if (arr[i] != NULL)
        {
            count++;
        }
    }
    return count;
}

int countSiblings(struct TreeNode *root, int key)
{
    if (root == NULL)
    {
        return 0;
    }
    if ((root->left != NULL && root->left->data == key && root->right != NULL) ||
        (root->right != NULL && root->right->data == key && root->left != NULL))
    {
        return 1;
    }
    return countSiblings(root->left, key) + countSiblings(root->right, key);
}

void displayMenu(){
    printf("=====Menu=====");
    printf("\n 1. Create binary tree using recursive function : ");
    printf("\n 2. Identify the height of binary tree : ");
    printf("\n 3. Identify degree of a given node : ");
    printf("\n 4. No. of leaf node in binary tree : ");
    printf("\n 5. No. of internal node in binary tree : ");
    printf("\n 6. No. of node in a binary tree using linked-list : ");
    printf("\n 7. No. of node in a binary tree using array : ");
    printf("\n 8. No. of siblings in binary tree : ");\
}

int main(){
    int data, node, choice, key, noLeaf, nointer, sib;
    struct TreeNode *root =NULL;

    do
    { 
        displayMenu();
        printf("\n Enter your choice : ");
        scanf("%d",&choice);

        switch (choice)
        {
        case 1:
            printf("Enter the data for bianry tree(-1 for stop): ");
            while (1)
            {
                scanf("%d",&data);
                if(data == -1){
                    break;
                }
                root=insert(root,data);
            }
            printf("Binary tree created successfully.\n");
            printf("Level Order Traversal of the binary tree: ");
            levelOrderTraversal(root);
            printf("\n");
            break;
        case 2:
            printf(" Height of binary tree: %d\n", treeHeight(root));
            break;
        case 3:
            printf(" Enter a key to find degree : ");
            scanf("%d",&key);
            int deg = nodeDegree(root,key);
            if(deg == -1){
                printf("Node not found in the tree.\n");
            }else{
                printf("Degree of node %d: %d\n", key, deg);
            }
            break;
        case 4:
            noLeaf = countLeaf(root);
            printf("Number of leaf Nodes : %d \n",noLeaf);
            break;
        case 5:
            nointer = countInternalNodes(root);
            printf("Number of internal nodes in the binary tree: %d\n", nointer);
            break;
        case 6:
            node = countNodesLinkedList(root);
            printf("Number of nodes in the binary tree (using linked list): %d\n", node);
            break;
        case 7:
            node = countNodesArray(root,countNodesLinkedList(root));
            printf("Number of nodes in the binary tree (using array): %d\n", node);
            break;
        case 8:
            printf("Enter the node data to find its siblings: ");
            scanf("%d", &key);
            sib = countSiblings(root, key);
            printf("Number of siblings of the node %d: %d\n", key, sib);
            break;     
        case 0 : 
            printf("Exiting the program....>!!");
            break;   
        default:  
            printf("You entered wrong choice....!!");        
            break;
        }
    } while (choice != 0);
    
    return 0;
}