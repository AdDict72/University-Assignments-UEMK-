# Create an empty dictionary called dog.Add name, color, breed, legs, age to the dog dictionary.

dog = dict()

name = input("Enter the name of the Dog: ")
dog['name'] = name
color = input("Enter the color of the Dog: ")
dog['color'] = color
breed = input("Enter the breed of the Dog: ")
dog['breed'] = breed
legs = int(input("Enter the no of legs of the Dog: "))
dog['legs'] = legs
age = input("Enter the age of the Dog: ")
dog['age'] = age

print(f"Dog dict ->\n{dog}")