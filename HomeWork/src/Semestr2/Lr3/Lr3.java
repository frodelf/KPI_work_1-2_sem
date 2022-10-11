package Semestr2.Lr3;

public class Lr3 {
    static int iter = 0;
    static int n = 10;
    public static void main(String[] args) {
        long m1 = System.currentTimeMillis();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        int resultMatrix[][] = task1(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(resultMatrix[i][j]+"\t");
            }
            System.out.println();
        }

        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("\nчас: "+time+"мс");
        System.out.println("кількість ітерацій: "+iter);
    }

     static int[][] task1(int [][] matrix){
        int[][] resultMatrix = new int[n][n];
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix.length; j++) {
                 resultMatrix[i][j] = matrix[i][j];
             }
         }

         for (int i = 0; i < matrix.length; i++) {
             int[] array = new int[resultMatrix.length-i];
             for (int j = matrix.length-1, num = 0; j >= i; j--) {
                 array[num++] = matrix[j][i];
                 iter++;
             }
             array = insertionSort(array);

             for (int j = 9, num = 0; j >= i; j--) {
                 resultMatrix[j][i] = array[num++];
                 iter++;
             }
         }
         return resultMatrix;
     }

     static int[] insertionSort(int array[]){
         for (int i = 0; i < array.length; i++) {
             int value = array[i];
             int j = i - 1;
             for (; j >= 0; j--) {
                 if (value < array[j]) {
                     array[j + 1] = array[j];
                 } else {
                     break;
                 }
                 iter++;
             }
             array[j + 1] = value;
         }
         return array;
     }

     static int[] selectionSort(int array[]){
         for (int i = 0; i < array.length - 1; i++) {
             int min = i;
             for (int j = i + 1; j < array.length; j++) {
                 if (array[min] > array[j]) {
                     min = j;
                 }
             }

             if (min != i) {
                 int temp = array[i];
                 array[i] = array[min];
                 array[min] = temp;
             }
             iter++;
         }
        return array;
     }
}
