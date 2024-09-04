def multiply_matrices(matrix1, matrix2):

    rows_matrix1 = len(matrix1)
    cols_matrix1 = len(matrix1[0])
    cols_matrix2 = len(matrix2[0])

    result_matrix = [[0 for _ in range(cols_matrix2)] for _ in range(rows_matrix1)]

    for i in range(rows_matrix1):
        for j in range(cols_matrix2):
            for k in range(cols_matrix1):
                result_matrix[i][j] += matrix1[i][k] * matrix2[k][j]

    return result_matrix

if __name__ == "__main__":
    matrix1 = []
    rows1 = int(input("Enter the number of rows for the first matrix: "))
    cols1 = int(input("Enter the number of columns for the first matrix: "))
    print("Enter the elements of the first matrix row by row:")
    for i in range(rows1):
        row = list(map(int, input().split()))
        if len(row) != cols1:
            print("Error: Number of elements does not match the specified number of columns.")
            exit()
        matrix1.append(row)

    matrix2 = []
    rows2 = int(input("Enter the number of rows for the second matrix: "))
    cols2 = int(input("Enter the number of columns for the second matrix: "))
    if cols1 != rows2:
        print("Error: Number of columns in the first matrix must equal the number of rows in the second matrix.")
        exit()
    print("Enter the elements of the second matrix row by row:")
    for i in range(rows2):
        row = list(map(int, input().split()))
        if len(row) != cols2:
            print("Error: Number of elements does not match the specified number of columns.")
            exit()
        matrix2.append(row)

    result_matrix = multiply_matrices(matrix1, matrix2)

    print("Resultant matrix after multiplication:")
    for row in result_matrix:
        print(row)

