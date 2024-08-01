def sum_of_natural_numbers(n):
    return n * (n + 1) // 2

range_limit = int(input("Enter the range (N) to calculate the sum of natural numbers: "))
sum_result = sum_of_natural_numbers(range_limit)
print(f"The sum of natural numbers up to {range_limit} is {sum_result}")
