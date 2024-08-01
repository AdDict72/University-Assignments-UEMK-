public class Q_3{
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 1}
        };

        boolean isSparse = checkSparse(matrix);

        if (isSparse) {
            System.out.println("The matrix is sparse.");
        } else {
            System.out.println("The matrix is not sparse.");
        }
    }

    public static boolean checkSparse(int[][] matrix) {
        int zeroCount = 0;
        int totalElements = matrix.length * matrix[0].length;

        for (int[] row : matrix) {
            for (int element : row) {
                if (element == 0) {
                    zeroCount++;
                }
            }
        }

   
        return zeroCount > (totalElements / 2);
    }
}
