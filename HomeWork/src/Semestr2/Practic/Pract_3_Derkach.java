package Semestr2.Practic;

public class Pract_3_Derkach {
    public static void main(String[] args) {
        int n = 15;
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        int index = 2;
        for (int i = 0; i < n-2; i++) {
            array[index] = array[index - 2] + array[index - 1];
            index++;
        }
        System.out.println("Числа Фібоначі:");
        for(int arr : array) System.out.print(arr+" ");
        System.out.println("\n\nВідсортованні по спаданню:");
        for(int arr : sort(array)) System.out.print(arr+" ");
    }

    static int[] sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int n = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = n;
                }
            }
        }
        return array;
    }
}
