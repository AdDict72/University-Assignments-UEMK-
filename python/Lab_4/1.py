strr = input("Enter the string : ")  
lenght = len(strr)
print(f"lenght is {lenght}")

subString = "country"
index = strr.lower().find(subString)
print(f"Position of {subString} is {index}")

import string

translator = str.maketrans('', '', string.punctuation)
cleaned_string = strr.lower().translate(translator)

words = cleaned_string.split()

word_count = {}
for word in words:
    if word in word_count:
        word_count[word] += 1
    else:
        word_count[word] = 1

print("Word occurrences:")
for word, count in word_count.items():
    print(f"{word}: {count}")

