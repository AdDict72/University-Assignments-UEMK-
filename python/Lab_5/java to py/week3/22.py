def print_alternate_elements(arr):
    for i in range(0, len(arr), 2):  
        print(arr[i])

if __name__ == "__main__":
    input_array = list(map(int, input("Enter integers for the array, separated by spaces: ").split()))

    print("Every alternate element in the array:")
    print_alternate_elements(input_array)
