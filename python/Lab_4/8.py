from collections import Counter

input_string = input("Enter a string: ")

char_count = Counter(input_string)

for char in sorted(char_count.keys()):
    print(f"{char},{char_count[char]}")
