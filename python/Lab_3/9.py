def printPattern(n) :
   gap = n-1
   for i in range (0,n):
    #1st line
    if(i==0):
      for k in range (gap) :
         print(' ', end=' ')
      print(".") 
      gap = gap -1 
      continue

    #last line
    if(i==n-1):
      for k in range (gap):
        print(' ', end=' ')
      gap = gap-1
      print("/", end=' ')
      for j in range(0,2*i-1):
        print("_", end=' ')
      print("\\", end=' ') 
      print()
      continue

    #middle lines
    if(n>i):
      for k in range (gap):
        print(' ', end=' ')
      gap = gap-1
      print("/", end=' ')
      for j in range(0,2*i-1):
        print(" ", end=' ')
      print("\\", end=' ') 
      print()
      continue

n =int(input("Enter the number of terms : "))
printPattern(n)