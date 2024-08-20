/*Write a C program to implement the concept of Selection sort on the above data set. Print thedata set after every iteration.*/

#include<stdio.h>

void selectionSort(int arr[],int count){
    int i,j,min_idx,temp;
    for ( i = 0; i < count-1; i++)
    {
        min_idx = i;
        for (j = i+1; j < count; j++)
        {
            if (arr[j]<arr[min_idx])
            {
                min_idx = j;
            }
        }

        temp = arr[i];
        arr[i] = arr[min_idx];
        arr[min_idx] = temp;

        printf("Iteration %d: ", i+1);
        for (int k = 0; k < count; k++) {
            printf("%d ", arr[k]);
        }
        printf("\n");
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

    selectionSort(arr,n);

    printf("\nSorted array : { ");
    for(int i = 0; i <n ; i++){
        printf("%d ",arr[i]);
    }
    printf("}\n");
    return 0;
}