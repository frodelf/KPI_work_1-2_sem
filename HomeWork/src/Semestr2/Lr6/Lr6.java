package Semestr2.Lr6;

public class Lr6 {
    static int length = 0;

    public static void main(String[] args) {
        int matrix[][] = new int[][]{   {0, 1, 0, 0, 0, 0},
                                        {0, 0, 4, 0, 0, 1},
                                        {0, 0, 0, 0, 0, 0},
                                        {4, 0, 0, 0, 0, 0},
                                        {0, 8, 0, 0, 2, 0},
                                        {0, 0, 5, 0, 0, 0}};
        System.out.println("Початкова матриця:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int disperseMatrix[][] = task(matrix);
        int disperseMatrixTest[][] = new int[length][3];
        System.out.println("\n");
        System.out.println("Розрідженна матриця:");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 3; j++) {
                disperseMatrixTest[i][j] = disperseMatrix[j][i];
                System.out.print(disperseMatrix[j][i] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        System.out.println("Відсортована розрідженна матриця:");

        for (int i = 0; i < length; i++) {
            bubbleSort(disperseMatrixTest[i]);
        }
    }


    static int[][] task (int matrix[][]){
        int a = 0;
        int b = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] != 0) length++;
            }
        }
        int rezerv[] = new int[length*3];
        int disperseMatrix[][] = new int[3][length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != 0) {
                    rezerv[a++] = i + 1;
                    rezerv[a++] = j + 1;
                    rezerv[a++] = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 3; j++) {
                disperseMatrix[j][i] = rezerv[b++];
            }
        }
        return disperseMatrix;
    }

    public static void bubbleSort(int matrix[]){
        int sort[] = new int[matrix.length];
        int rezerv = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length-1; j++) {
                if(matrix[j] > matrix[j+1]){
                    rezerv = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = rezerv;
                }
            }
        }
        for (int arr : matrix) System.out.print(arr + "\t");
        System.out.println();
    }
}
