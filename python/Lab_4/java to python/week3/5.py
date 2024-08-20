
def find_range(arr):
    if not arr:
        raise ValueError("Array is empty")

    min_value = min(arr)
    max_value = max(arr)

    range_value = max_value - min_value

    return range_value

def main():
    arr = list(map(float, input("Enter the elements of the array separated by space: ").split()))
    
    try:
        range_value = find_range(arr)
        print(f"The range of the array is: {range_value}")
    except ValueError as e:
        print(e)

if __name__ == "__main__":
    main()
