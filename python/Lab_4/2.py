
input_string = input("Enter a comma-separated sequence of words: ")
words = input_string.split(',')
sorted_words = sorted(words)
output_string = ','.join(sorted_words)

print(output_string)
