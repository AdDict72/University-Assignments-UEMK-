def count_non_zero_elements(arr):
    non_zero_count = sum(1 for num in arr if num != 0)
    return non_zero_count

if __name__ == "__main__":
    input_array = list(map(int, input("Enter integers separated by spaces: ").split()))

    non_zero_count = count_non_zero_elements(input_array)
    
    print("Number of non-zero elements in the array:", non_zero_count)
