
def linear_search(arr, target):
    for index, element in enumerate(arr):
        if element == target:
            return index 
    return -1  

def main():
    arr = list(map(float, input("Enter the elements of the array separated by space: ").split()))
    
    target = float(input("Enter the element to search for: "))
    
    index = linear_search(arr, target)
    
    if index != -1:
        print(f"Element {target} found at index {index}.")
    else:
        print(f"Element {target} not found in the array.")

if __name__ == "__main__":
    main()
