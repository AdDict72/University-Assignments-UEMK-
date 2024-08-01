def factorial(n) :
    if n==0 or n==1 :
       return 1
    else :
        fact = 1
        for i in range(2,n+1) :
             fact = fact * i
        return fact

def sin_calculate(x,n) :
    sin_x = 0 
    for i in range (n) :
        sign = (-1) ** i
        term = sign * (x**(2*i+1))/factorial(2*i+1)
        sin_x = sin_x + term
    return sin_x

x = float(input("Enter the value of x(in radian) : "))
n = int(input("Enter n value : "))

sinX = sin_calculate(x,n)
print("Sin(x) is : ",sinX)