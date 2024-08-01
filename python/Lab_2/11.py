def sum_of_digits(n):
    sum = 0
    while n > 0:
        sum += n % 10
        n = n // 10
    return sum

number = int(input("Enter a number: "))

result = sum_of_digits(number)
print(f"The sum of the digits of {number} is {result}")
