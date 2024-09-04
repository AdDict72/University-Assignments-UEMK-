#include <stdio.h>

void updateArray(int arr[], int size) {
    printf("Inside updateArray function:\n");
    for (int i = 0; i < size; i++) {
        arr[i] += 10;  
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[5] = {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);

    updateArray(arr, size);

    printf("Inside main function (after updateArray call):\n");
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
