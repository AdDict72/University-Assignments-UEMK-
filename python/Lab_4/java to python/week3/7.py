
arr = list(map(int, input("Enter the elements of the array separated by space: ").split()))
sum = 0
for i in arr:
    if i % 2 == 0:
        sum += i

print(f"Sum = {sum}")