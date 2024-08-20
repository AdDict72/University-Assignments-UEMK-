
rows = int(input("Enter the number of rows in the matrix: "))
columns = int(input("Enter the number of columns in the matrix: "))

matrix = []
for i in range(rows):
    row = list(map(int, input(f"Enter row {i + 1} elements separated by space: ").split()))
    if len(row) != columns:
        raise ValueError(f"Each row must have exactly {columns} elements.")
    matrix.append(row)

transposed_matrix = [[0] * rows for _ in range(columns)]

for i in range(rows):
    for j in range(columns):
        transposed_matrix[j][i] = matrix[i][j]

print("Original Matrix->")
for row in matrix:
    for i in range(columns):
        print(row[i], end=" ")
    print()
print("Transposed Matrix->")
for row in transposed_matrix:
    for i in range(rows):
        print(row[i], end=" ")
    print()