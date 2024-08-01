def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)

def is_krishnamurthy_number(number):
    digits = [int(digit) for digit in str(number)]
    sum_of_factorials = sum(factorial(digit) for digit in digits)
    return sum_of_factorials == number

number = int(input("Enter a number: "))
if is_krishnamurthy_number(number):
    print(f"{number} is a Krishnamurthy number.")
else:
    print(f"{number} is not a Krishnamurthy number.")
