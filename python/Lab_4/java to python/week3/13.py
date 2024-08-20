rows = int(input("Enter the number of rows in the matrix: "))
columns = int(input("Enter the number of columns in the matrix: "))

matrix = []
for i in range(rows):
    row = list(map(int, input(f"Enter row {i + 1} elements separated by space: ").split()))
    if len(row) != columns:
        raise ValueError(f"Each row must have exactly {columns} elements.")
    matrix.append(row)

zero_count = 0  
total_elements = 0  

for row in matrix:
    for element in row:
        if element == 0:
            zero_count += 1
        total_elements += 1

if zero_count > total_elements / 2:
    print("Sparse Matrix")
else:
    print("Not a Sparse Matrix")