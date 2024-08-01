import math
def compute_euler_number(n):
    e = 1  
    factorial = 1  
    
    for i in range(1, n + 1):
        factorial *= i  
        e += 1 / factorial 
    return e

n = int(input("Enter the number of terms to approximate Euler's number: "))

euler_number = compute_euler_number(n)
print(f"The approximate value of Euler's number with {n} terms is: {euler_number}")
