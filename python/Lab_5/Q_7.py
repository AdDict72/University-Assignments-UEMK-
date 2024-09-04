# Create a student dictionary and add first_name, last_name, gender, age, marital status, skills,
# country, city and address as keys for the dictionary
# I. Get the length of the student dictionary
# II. Get the value of skills and check the data type, it should be a list
# III. Modify the skills values by adding one or two skills
# IV. Get the dictionary keys as a list
# V. Get the dictionary values as a list
# VI. Change the dictionary to a list of tuples using _items()_ method
# VII. Delete one of the items in the dictionary
# VIII. Delete one of the dictionaries

first_name = input("Enter the first name: ")
last_name = input("Enter the last name: ")
gender = input("Enter the gender: ")
age = int(input("Enter the age: "))
maritial_status = input("Enter the marital status: ")
skills = input("Enter the skills: ")
country = input("Enter the country: ")
city = input("Enter the city: ")
address = input("Enter the address: ")

student = { "first_name": first_name, "last_name": last_name, "gender": gender, "age": age, "marital status": maritial_status, "skills": [skill for skill in skills.split(",")], "country": country, "city": city, "address": address }

print(f"Length = {len(student)}")
print(f"Skills -> {student["skills"]}")
print(f"Skills type -> {type(student["skills"])}")

new_skills = input("Enter new skills: ")
skills = student["skills"]
for skill in new_skills.split(","):
    skills.append(skill)

student.update({"skills": skills})

print(f"Keys -> {student.keys()}")
print(f"Keys -> {student.values()}")

student_list = student.items()

key = input("Enter the key to remove: ")
student.pop(key)
print(f"After removing '{key}' the dictonary->\n{student}")

del student
try:
    print(student)
except Exception as e:
    print(f"Student dictionary is deleted.\nError-> {e}")