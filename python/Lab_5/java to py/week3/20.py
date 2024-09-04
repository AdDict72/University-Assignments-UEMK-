def subtract_matrices(matrix1, matrix2):

    rows = len(matrix1)
    cols = len(matrix1[0])

    result_matrix = [[0 for _ in range(cols)] for _ in range(rows)]

    for i in range(rows):
        for j in range(cols):
            result_matrix[i][j] = matrix1[i][j] - matrix2[i][j]

    return result_matrix

if __name__ == "__main__":
    matrix1 = []
    rows = int(input("Enter the number of rows for the matrices: "))
    cols = int(input("Enter the number of columns for the matrices: "))
    print("Enter the elements of the first matrix row by row:")
    for i in range(rows):
        row = list(map(int, input().split()))
        if len(row) != cols:
            print("Error: Number of elements does not match the specified number of columns.")
            exit()
        matrix1.append(row)

    matrix2 = []
    print("Enter the elements of the second matrix row by row:")
    for i in range(rows):
        row = list(map(int, input().split()))
        if len(row) != cols:
            print("Error: Number of elements does not match the specified number of columns.")
            exit()
        matrix2.append(row)

    result_matrix = subtract_matrices(matrix1, matrix2)

    print("Resultant matrix after subtraction:")
    for row in result_matrix:
        print(row)
