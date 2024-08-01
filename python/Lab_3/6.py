n =int(input("Enter the number of terms : "))
sum = 0
for i in range (1,n+1) :
    if i%2==0 :
        sum = sum - (1/i)
    else :
        sum = sum + (1/i)

print("The sum is : ",sum)
