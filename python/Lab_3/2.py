def calculate_slope(x1,x2,y1,y2):
    if x2>x1:
        return (y2-y1)/(x2-x1)
    else :
        print("Wrong value entered...x1 must be less than x2")
        return None

x1,x2,y1,y2 = map(float,input("Enter the values of x1,x2,y1,y2 : ").split())
slope = calculate_slope(x1,x2,y1,y2)
if slope is not None :
    print("The slope is : ",slope)