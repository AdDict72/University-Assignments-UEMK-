def is_buzz_number(number):
    if number % 7 == 0 or number % 10 == 7:
        return True
    else:
        return False

number = int(input("Enter a number: "))

if is_buzz_number(number):
    print(f"{number} is a Buzz number.")
else:
    print(f"{number} is not a Buzz number.")
