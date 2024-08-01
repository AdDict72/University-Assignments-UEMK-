def count_digits(number):
    number = abs(number)
    return len(str(number))

number = int(input("Enter an integer: "))
digit_count = count_digits(number)
print(f"The number of digits in {number} is {digit_count}")
