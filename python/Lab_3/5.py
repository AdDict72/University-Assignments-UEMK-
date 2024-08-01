def reverse_list(arr) :
    rev_arr = []
    for i in range (len(arr)-1,0):
        rev_arr.append(arr[i])
    return rev_arr

arr = [4,5,6,7,8,9]
rev_arr = reverse_list(arr)
print("Original : ",arr)
print("Reversed : ",rev_arr)
