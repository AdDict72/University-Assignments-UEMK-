
def sum_main_diagonal(matrix):

    n = len(matrix) 
    sum_diagonal = sum_diagonal2 = 0

    for i in range(n):
        sum_diagonal += matrix[i][i]  
        sum_diagonal2 += matrix[i][n - i - 1]
    return sum_diagonal, sum_diagonal2

n = int(input("Enter the size of the matrix (n x n): "))

matrix = []
for i in range(n):
    row = list(map(float, input(f"Enter row {i + 1} elements separated by space: ").split()))
    if len(row) != n:
        raise ValueError(f"Each row must have exactly {n} elements.")
    matrix.append(row)
    
sum_main, sum_secondary = sum_main_diagonal(matrix)
print(f"Sum of the main diagonal elements: {sum_main}")
print(f"Sum of the secondary diagonal elements: {sum_secondary}")