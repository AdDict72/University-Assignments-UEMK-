def find_second_highest(arr):
    if len(arr) < 2:
        return None  

    highest = second_highest = float('-inf')

    for num in arr:
        if num > highest:
            second_highest, highest = highest, num
        elif highest > num > second_highest:
            second_highest = num

    return second_highest if second_highest != float('-inf') else None

if __name__ == "__main__":
    array = [3, 5, 7, 2, 8, 9, 10, 6]

    second_highest = find_second_highest(array)

    if second_highest is not None:
        print("The second highest element is:", second_highest)
    else:
        print("Array does not have enough distinct elements.")
