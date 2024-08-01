def factorial(n) :
    if n==0 or n==1 :
       return 1
    else :
        fact = 1
        for i in range(2,n+1) :
             fact = fact * i
        return fact

def cos_calculate(x,n) :
    cos_x = 0 
    for i in range (n) :
        sign = (-1) ** i
        term = sign * (x**(2*i))/factorial(2*i)
        cos_x = cos_x + term
    return cos_x

x = float(input("Enter the value of x(in radian) : "))
n = int(input("Enter n value : "))

cosX = cos_calculate(x,n)
print("Cos(x) is : ",cosX)