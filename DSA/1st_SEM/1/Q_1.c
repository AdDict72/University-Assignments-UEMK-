/*1. Write a C program to print an array*/
#include<stdio.h>

int main(){
    int count;
    printf("Enter the number of elements in the array : ");
    scanf("%d",&count);
    int arr[count];
    printf("Enter the elements in the array : ");
    for (int i = 0; i < count; i++)
    {
        scanf("%d",&arr[i]);     
    }

    //printing the array
    printf("[");
    for (int i = 0; i < count; i++)
    {
        printf("%d",arr[i]);  
        if(i< count-1){
            printf(", ");
        }   
    }
    printf("]");

    return 0;
}