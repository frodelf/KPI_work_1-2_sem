package Semestr2.Practic;

class Task1{
    public static void main(String[] args) {
        int martrix[] = new int[12];
        for (int i = 0; i < 12; i++) {
            martrix[i] = (int) (Math.random() * 20 - 10);
        }
        for(int ar : martrix) System.out.print(ar + "\t");

        int sum = 0;
        for(int ar : martrix){
            if(ar < 0) sum += Math.pow(ar, 3);
        }

        System.out.println("\n\nСума кубів від'ємних чисел рівна " + sum);
        System.out.println("мінімальне додатнє число " + minChislo(martrix));
    }

    static int minChislo(int matrix[]){
        int min = 10;
        for(int ar : matrix){
            if(ar < min  &&  ar > 0){
                min = ar;
            }
        }
        return min;
    }
}

class Test2{
    public static void main(String[] args) {
        int vid = 0, dod = 0;
        int martrix[][] = new int[5][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                martrix[i][j] = (int) (Math.random() * 20 - 10);
                System.out.print(martrix[i][j] + "\t");
                if(martrix[i][j] > 0) dod++;
                if(martrix[i][j] < 0) vid++;
            }
            System.out.println();
        }
        System.out.println("Кількість від'ємних чисел " + vid);
        System.out.println("Кількість додатніх чисел " + dod);
    }
}