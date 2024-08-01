def print_matrix(matrix):
    for row in matrix:
        print(" ".join(map(str, row)))

n = 5
matrix = [[0] * n for _ in range(n)]

#1st column
for i in range (0,n) :
   matrix[i][0] =i+1
#2nd column 
for i in range (0,n) :
   matrix[i][1] = 1
#other column
for i in range (0,n):
   for j in range(2,n):
      matrix[i][j] = matrix[i][0] * matrix[i][j-1]
      



print_matrix(matrix)
