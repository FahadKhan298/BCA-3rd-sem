#include <stdio.h>

int main() {
    int n, i, j;
    int matrix[100][100]; // assuming max size 100x100
    int sum = 0;

    // Input matrix size
    printf("Enter matrix size (N): ");
    scanf("%d", &n);

    // Check for valid size
    if (n <= 0 || n > 100) {
        printf("Invalid size. Please enter a value between 1 and 100.");
        return 1;
    }

    // Input matrix elements
    printf("Enter matrix elements:\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            scanf("%d", &matrix[i][j]);
        }
    }

    // Calculate sum of diagonal elements
    for (i = 0; i < n; i++) {
        sum += matrix[i][i]; // primary diagonal
        // sum += matrix[i][n-i-1]; // secondary diagonal
    }

    // Print result
    printf("Sum of diagonal elements: %d\n", sum);

    return 0;
}





