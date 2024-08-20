/*2. Write a C program to check whether a given string is Palindrome or not.*/
#include<stdio.h>
#include<string.h>
#define MAX_SIZE 100

int palindrome(char* str){
    int len = strlen(str);
    int i ;

    for ( i = 0; i < len/2; i++)
    {
       if(str[i] != str[len-i-1]){
        return 0;
       }
    }
    return 1;    
}

int main(){
    char str[MAX_SIZE];
    printf("Enter the string : ");
    scanf("%s",str); 

    if(palindrome(str)){
        printf("The string is a palindrome.\n");
    }else{
        printf("The string is not palindrome\n");
    }

    return 0;
}