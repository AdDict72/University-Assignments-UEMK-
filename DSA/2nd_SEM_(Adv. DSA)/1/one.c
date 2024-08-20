/*Data Set- : 27,15,39,21,28,70, Write a C program to implement the concept of Bubble sort on the above data set. Print the data set after every iteration.*/

#include<stdio.h>

void bubbleSort(int arr[],int n){
    int i,j,temp;
    for (i = 0; i < n-1; i++)
    {
        for (j = 0; j < n-i-1; j++)
        {
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                
                printf("Iteration %d : ",i+1);
                for (int k = 0; k < n; k++)
                {
                printf("%d ",arr[k]);
                }
                printf("\n");                   
            }                       
        }        
    }    
}

int main(){
    int arr[]={27,15,39,21,28,70};
    int n = sizeof(arr)/sizeof(arr[0]);

    printf("Original array : ");
    for(int i = 0 ; i<n ; i++){
        printf("%d ",arr[i]);
    }
    printf("\n");

    bubbleSort(arr,n);

    printf("\nSorted array : { ");
    for(int i = 0; i <n ; i++){
        printf("%d ",arr[i]);
    }
    printf("}\n");
    return 0;
}