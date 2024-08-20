input_string = input("Enter a sentence: ")

letters = 0
digits = 0

for char in input_string:
    if char.isalpha():
        letters += 1 
    elif char.isdigit():
        digits += 1 

print(f"LETTERS {letters}")
print(f"DIGITS {digits}")

