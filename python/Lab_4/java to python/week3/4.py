
def get_matrix_from_user(rows, cols, matrix_number):
    print(f"Enter elements for Matrix {matrix_number}:")
    matrix = []
    for i in range(rows):
        row = list(map(int, input(f"Enter row {i + 1} elements separated by space: ").split()))
        if len(row) != cols:
            raise ValueError(f"Each row must have exactly {cols} elements.")
        matrix.append(row)
    return matrix

def sum_matrices(matrix1, matrix2):
    # Create a new matrix to store the result
    result = [[0 for _ in range(len(matrix1[0]))] for _ in range(len(matrix1))]
    
    # Perform element-wise addition
    for i in range(len(matrix1)):
        for j in range(len(matrix1[0])):
            result[i][j] = matrix1[i][j] + matrix2[i][j]
    
    return result

def main():
    rows = int(input("Enter the number of rows for the matrices: "))
    cols = int(input("Enter the number of columns for the matrices: "))
    
    matrix1 = get_matrix_from_user(rows, cols, 1)
    matrix2 = get_matrix_from_user(rows, cols, 2)

    sum_matrix = sum_matrices(matrix1, matrix2)

    print("Sum of the matrices:")
    for row in sum_matrix:
        for i in range(rows):
            print(f"{row[i]}", end=" ")
        print()

if __name__ == "__main__":
    main()
