public class Q_18{
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        
        int[] result = addArrays(array1, array2);
        
        System.out.println("Resultant Array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    public static int[] addArrays(int[] array1, int[] array2) {
        int length = Math.min(array1.length, array2.length); 
        
        int[] result = new int[length];
        
        for (int i = 0; i < length; i++) {
            result[i] = array1[i] + array2[i]; 
        }
        
        return result;
    }
}
