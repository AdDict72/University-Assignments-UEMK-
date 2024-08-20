#include<stdio.h>
#define MAX_SIZE 10

int main(){
    int matrix[MAX_SIZE][MAX_SIZE];
    int row,col,i,j;
    int symmetric = 1;

    printf("Enter the number of rows and columns of the matrix (max %d each): ", MAX_SIZE);
    scanf("%d %d", &row, &col);

    printf("Enter the elements of the matrix:\n");
    for ( i = 0; i < row; i++)
    {
        for ( j = 0; j < col ; j++)
        {
            scanf("%d",&matrix[i][j]);
        }
    }
    
    for ( i = 0; i < row; i++)
    {
        for ( j = 0; j < col ; j++)
        {
            if(matrix[i][j]!=matrix[j][i]){
                symmetric = 0;
                break;
            }
        }
        if (symmetric==0){
            break;
        }      
    }

    if (symmetric==1)
    {
        printf("The matrix is symetric.\n");
    }
    else{
        printf("The matrix is not symetric.\n");
    }

    return 0;
}