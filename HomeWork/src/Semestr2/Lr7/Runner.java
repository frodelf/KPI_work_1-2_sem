package Semestr2.Lr7;

public class Runner {
    static int parnih = 0;
    public static void main(String[] args) {
        Tree root = new Tree(1,
                new Tree(2,
                        new Tree(3,null,null),null),
                new Tree(4,
                        new Tree(5,new Tree(7,null,null),null),
                        new Tree(6,new Tree(8,null,null),null)));
        System.out.println("Значення вузлів у яких тільки один назадок(лівий):");
        root.summPrintTree();
        System.out.println("Кількість парних елементів: " + parnih);
    }
}

class Tree{

    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void summPrintTree(){


        if(value % 2 == 0)Runner.parnih++;
        if(right == null  &&  left != null) System.out.println(value);
        if(left != null) {
            left.summPrintTree();
        }

        if(right != null) {
            right.summPrintTree();
        }
    }
}
