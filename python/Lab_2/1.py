import math

def sum_of_square_roots(a, b, c):
    return math.sqrt(a) + math.sqrt(b) + math.sqrt(c)

a, b, c = map(float, input("Enter three numbers: ").split())
sum_sqrt = sum_of_square_roots(a, b, c)
print("The sum of the square roots of the numbers is:", sum_sqrt)
