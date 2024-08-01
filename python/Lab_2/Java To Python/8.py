def print_multiples_of_10(start, end):
    print(f"Multiples of 10 between {start} and {end}:")
    for number in range(start, end + 1):
        if number % 10 == 0:
            print(number, end=" ")
    print()  

start = int(input("Enter the start of the interval: "))
end = int(input("Enter the end of the interval: "))

print_multiples_of_10(start, end)
