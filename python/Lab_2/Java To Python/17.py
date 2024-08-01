def find_median(numbers):
    numbers.sort()
    length = len(numbers)
    if length % 2 == 0:
        middle1 = length // 2 - 1
        middle2 = length // 2
        median = (numbers[middle1] + numbers[middle2]) / 2
    else:
        middle = length // 2
        median = numbers[middle]
    return median

n = int(input("Enter the number of elements: "))
numbers = []

print("Enter the numbers:")
for _ in range(n):
    number = float(input())
    numbers.append(number)

median = find_median(numbers)
print(f"The median is: {median}")
