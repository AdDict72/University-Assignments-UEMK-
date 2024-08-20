#include<stdio.h>

int main(){
    double centi;
    printf("Enter the Centigrade temperature : ");
    scanf("%d",&centi);

    double fahr = (centi * 9/5)+32;
    
    printf("Fahrenheit temperature : %f",fahr);
    return 0;
}