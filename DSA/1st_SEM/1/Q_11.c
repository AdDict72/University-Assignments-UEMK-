#include<stdio.h>

int main(){
    int count;
    int flag = 1;
    printf("Enter the number of elements in the array : ");
    scanf("%d",&count);
    int arr[count];
    printf("Enter the elements in the array : ");
    for (int i = 0; i < count; i++)
    {
        scanf("%d",&arr[i]);     
    }
    for (int i = 0; i < count; i++)
    {
        for (int j = i+1; j < count; j++)
        {
            if(arr[i]==arr[j]){
                flag=0;
                break;
            }
        }
        if (flag==0)
        {
            break;
        }        
    }
    if (flag==0)
    {
        printf("Duplicate number found");
    }
    else{
        printf("No duplicate number found");
    } 
    return 0;
}