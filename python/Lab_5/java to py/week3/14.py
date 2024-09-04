import math

def is_prime(n):
    if n <= 1:
        return False
    if n == 2 or n == 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    for i in range(5, int(math.sqrt(n)) + 1, 6):
        if n % i == 0 or n % (i + 2) == 0:
            return False
    return True

def count_primes(arr):
    prime_count = sum(1 for num in arr if is_prime(num))
    return prime_count

if __name__ == "__main__":
    input_array = list(map(int, input("Enter numbers separated by spaces: ").split()))
    prime_count = count_primes(input_array)
    print("Number of prime numbers in the array:", prime_count)
