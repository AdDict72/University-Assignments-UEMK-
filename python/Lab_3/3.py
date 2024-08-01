import math

def solve_quadratic_eqn(a, b, c):
    discriminant = b**2 - 4*a*c
    
    if discriminant > 0:
        # Two distinct real roots
        root1 = (-b + math.sqrt(discriminant)) / (2*a)
        root2 = (-b - math.sqrt(discriminant)) / (2*a)
        return (root1, root2)
    elif discriminant == 0:
        # One real root (repeated)
        root = -b / (2*a)
        return root
    else:
        # Complex roots
        real_part = -b / (2*a)
        imaginary_part = math.sqrt(-discriminant) / (2*a)
        root1 = (real_part, imaginary_part)
        root2 = (real_part, -imaginary_part)
        return (root1, root2)

a, b, c = map(float, input("Enter the coefficients a, b, c: ").split())
solutions = solve_quadratic_eqn(a, b, c)
print("The solutions are:", solutions)
