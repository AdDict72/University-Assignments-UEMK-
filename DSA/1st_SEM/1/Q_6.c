#include<stdio.h>
void fib(int n){
    int ele1 = 0;
    int ele2 = 1;
    int nextTerm;
    printf("Fibonacci series : %d ,%d ,",ele1,ele2);
    for (int i = 2; i < n; i++)
    {   
        printf("%d ",ele1+ele2);
        nextTerm=ele1+ele2;
        ele1=ele2;
        ele2=nextTerm;
        if(i<n-1){
            printf(",");
        }
    }
    
}
int main(){
    int count;
    printf("Enter the number of elements in the Fibonacci series : ");
    scanf("%d",&count);

    fib(count);

    return 0;
}