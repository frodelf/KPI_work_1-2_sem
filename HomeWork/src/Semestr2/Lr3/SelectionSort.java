package Semestr2.Lr3;

public class SelectionSort {
    static int itter = 0;
    public static void main(String[] args) {
        long m1 = System.currentTimeMillis();
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
        System.out.println("\n___Selection Sort___");
        int matrixResultT1[][] = task1(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrixResultT1[i][j]+" ");
            }
            System.out.println();
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("\nчас: "+time+"мс");
        System.out.println("Кількість іттерацій: "+itter);
    }

    static int[][] task1(int[][] array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < index; j++) {
                int pos = j;
                int min = array[i][j];
                for (int k = j + 1; k < index+1; k++) {
                    itter++;
                    if(array[i][k] < min){
                        pos = k;
                        min = array[i][k];
                    }
                }
                array[i][pos] = array[i][j];
                array[i][j] = min;
            }
            index++;
        }
        return array;
    }
}