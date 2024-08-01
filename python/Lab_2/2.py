import math

def solveEqun(a,b,c):
    d = b*b - 4*a*c
    sqrt_d = math.sqrt(abs(d))

    if d>0 :
        print("Root is real and different")
        print((-b + sqrt_d )/(2*a))
        print((-b - sqrt_d )/(2*a))
    
    elif d==0 :
        print("Root is real and same")
        print(-b/(2*a))

    else :
        print("Root is complex")


a,b,c = map(float,input("Enter a,b,c of the quadratic equation : ").split())
if a==0 : 
    print("Wrong input ...")
else :
    solveEqun(a,b,c)
