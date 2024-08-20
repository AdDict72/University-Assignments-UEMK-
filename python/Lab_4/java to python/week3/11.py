
rows = int(input("Enter the number of rows in the matrix: "))
columns = int(input("Enter the number of columns in the matrix: "))

matrix = []
for i in range(rows):
    row = list(map(int, input(f"Enter row {i + 1} elements separated by space: ").split()))
    if len(row) != columns:
        raise ValueError(f"Each row must have exactly {columns} elements.")
    matrix.append(row)

odd_sum = 0
for row in matrix:
    for element in row:
        if element % 2 != 0:  
            odd_sum += element

print(f"Sum of odd elements = {odd_sum}")