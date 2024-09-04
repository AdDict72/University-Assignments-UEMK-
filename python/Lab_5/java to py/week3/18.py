def add_arrays_index_wise(arr1, arr2):
    if len(arr1) != len(arr2):
        raise ValueError("Both arrays must have the same length.")
    
    result_array = [arr1[i] + arr2[i] for i in range(len(arr1))]
    return result_array

if __name__ == "__main__":
    input_array1 = list(map(int, input("Enter integers for the first array, separated by spaces: ").split()))
    input_array2 = list(map(int, input("Enter integers for the second array, separated by spaces: ").split()))

    if len(input_array1) != len(input_array2):
        print("Error: Both arrays must have the same number of elements.")
    else:
        result_array = add_arrays_index_wise(input_array1, input_array2)
        print("Resultant array after adding index-wise:", result_array)
