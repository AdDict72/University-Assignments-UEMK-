def merge_sorted_arrays(A, B):
    i, j = 0, 0
    C = []

    while i < len(A) and j < len(B):
        if A[i] <= B[j]:
            C.append(A[i])
            i += 1
        else:
            C.append(B[j])
            j += 1

    while i < len(A):
        C.append(A[i])
        i += 1

    while j < len(B):
        C.append(B[j])
        j += 1

    return C

if __name__ == "__main__":
    A = list(map(int, input("Enter sorted integers for the first array, separated by spaces: ").split()))

    B = list(map(int, input("Enter sorted integers for the second array, separated by spaces: ").split()))

    C = merge_sorted_arrays(A, B)

    print("Merged sorted array:")
    print(C)
