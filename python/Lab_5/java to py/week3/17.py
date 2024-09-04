def merge_float_arrays(arr1, arr2):
    merged_array = arr1 + arr2
    return merged_array

if __name__ == "__main__":
    input_array1 = list(map(float, input("Enter floats for the first array, separated by spaces: ").split()))

    input_array2 = list(map(float, input("Enter floats for the second array, separated by spaces: ").split()))

    merged_array = merge_float_arrays(input_array1, input_array2)

    print("Merged array:", merged_array)
