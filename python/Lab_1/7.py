def find_special_numbers(start, end):
    special_numbers = []
    for num in range(start, end + 1):
        if num % 7 == 0 and num % 5 != 0:
            special_numbers.append(num)
    return special_numbers

start = 1000
end = 2000

special_numbers = find_special_numbers(start, end)
print(f"Numbers divisible by 7 but not multiples of 5 between {start} and {end}:")
print(special_numbers)
