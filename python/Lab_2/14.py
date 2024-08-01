def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)

def print_factorial_series(N):
    for i in range(1, N + 1):
        print(factorial(i), end=" ")

N = int(input("Enter the number of terms: "))

print_factorial_series(N)
