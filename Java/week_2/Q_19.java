public class Q_19 {

    public static void main(String[] args) {
        generateCombinations();
    }

    public static void generateCombinations() {
        int[] numbers = {1, 2, 3};

        System.out.println("All combinations of 1, 2, or 3:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {
                    System.out.print(numbers[i] + " ");
                    System.out.print(numbers[j] + " ");
                    System.out.print(numbers[k] + " | ");
                }
            }
        }
    }
}
