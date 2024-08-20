#include<stdio.h>

void reverseArr(int arr[],int count){
    printf("\nReverse array : [");
    for (int i = count-1; i >= 0 ; i--)
    {
        printf("%d",arr[i]);  
        if(i > 0){
            printf(", ");
        }   
    }
    printf("]");
}

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

    printf("Original array : [");
    for (int i = 0; i < count; i++)
    {
        printf("%d",arr[i]);  
        if(i< count-1){
            printf(", ");
        }   
    }
    printf("]");

    reverseArr(arr,count);
    return 0;
}