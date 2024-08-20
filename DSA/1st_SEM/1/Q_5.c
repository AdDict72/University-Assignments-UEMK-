#include<stdio.h>

int sortArr(int arr[],int count){
    int i,j,temp;
    for (i = 0; i < count-1; i++)
    {
        for (j = 0; j < count-i-1; j++)
        {
            if (arr[j] > arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] =temp;               
            }            
        }            
    }
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

    sortArr(arr,count);

    printf("Largest and second largest element of the array : %d & %d ",arr[count-1],arr[count-2]);
    

    return 0;
}