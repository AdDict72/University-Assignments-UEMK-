from collections import Counter

def find_duplicates(arr):
    count = Counter(arr)    
    duplicates = {element: freq for element, freq in count.items() if freq > 1}
    return duplicates

if __name__ == "__main__":
    input_array = list(map(int, input("Enter integers for the array, separated by spaces: ").split()))

    duplicates = find_duplicates(input_array)    
    if duplicates:
        print("Duplicate elements and their frequencies:")
        for element, freq in duplicates.items():
            print(f"{element}: {freq}")
    else:
        print("No duplicate elements found.")
