package Semestr2.Lr3;

public class Test {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        for(int arr : array){
            System.out.print(arr+" ");
        }
        System.out.println();
        int array1[] = sort(array);
        for(int arr : array1){
            System.out.print(arr+" ");
        }
        System.out.println("\n\n");


        int matrix[][] = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        int matrixResult[][] = task1(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrixResult[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
        return array;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////

    static int[][] task1(int[][] array){
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < index; j++) {
                int value = array[i][j];
                int k = j - 1;
                for (; k >= 0; k--) {
                    if(value < array[i][k]){
                        array[i][k + 1] = array[i][k];
                    }
                    else break;
                }
                array[i][k + 1] = value;
            }
            index++;
        }
        return array;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////

}
