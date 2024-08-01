def is_eligible(maths, physics, chemistry):
    if (maths >= 60 and physics >= 50 and chemistry >= 40 and
        (maths + physics + chemistry >= 200)) or (maths + physics >= 150):
        return True
    return False

def process_applications(n):
    eligible_students = []
    for i in range(n):
        print(f"Enter marks for student {i+1}:")
        maths = int(input("  Mathematics: "))
        physics = int(input("  Physics: "))
        chemistry = int(input("  Chemistry: "))

        if is_eligible(maths, physics, chemistry):
            eligible_students.append(i+1)
    
    if eligible_students:
        print("Eligible students:", eligible_students)
    else:
        print("No eligible students.")

n = int(input("Enter the number of students: "))
process_applications(n)
