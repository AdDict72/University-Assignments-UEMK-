def is_perfect_number(number):
  sum_of_divisors = 1  
  for i in range(2, int(number**0.5) + 1):  
    if number % i == 0:
      sum_of_divisors += i
      if i * i == number:  
        continue
      sum_of_divisors += number // i
  return sum_of_divisors == number

def is_armstrong_number(number):
  original_number = number
  sum_of_digits = 0
  while number > 0:
    digit = number % 10
    sum_of_digits += digit**len(str(original_number))  
    number //= 10
  return sum_of_digits == original_number

number = int(input("Enter a number: "))


if is_perfect_number(number):
  print(number, "is a perfect number.")
else:
  print(number, "is not a perfect number.")

if is_armstrong_number(number):
  print(number, "is an Armstrong number.")
else:
  print(number, "is not an Armstrong number.")
