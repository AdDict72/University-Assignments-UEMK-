def GCD(n1 , n2) :
    gcd = 1
    for i in range(1,min(n1,n2)+1) :
        if n1%i==0 and n2%i==0 :
            gcd = i
    return gcd

n1,n2 = map(int, input("Enter two numbers : ").split())
gcd = GCD(n1,n2)
lcm = (n1*n2)//gcd

print("LCM of the numbers is :",lcm)