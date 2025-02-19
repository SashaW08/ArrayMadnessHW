import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        new ArrayLists();
    }

    ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayLists(){
        System.out.println("Welcome to the wonderful world of array lists!");

        for(int x=1; x<43; x++){
            list.add((int)(Math.random()*75)+7);
        }
        printArrayList();
        System.out.println("The average number in the array list is "+avgnumber());
    }

    public void printArrayList(){

        for(int a=0; a<list.size(); a++){
            System.out.println(a+": "+list.get(a));
        }
        System.out.println(list);
    }

    public double avgnumber(){
        int x = 0;

        for(int y=0; y<list.size(); y++){
            x=x+list.get(y);
        }

        x=x/(43);

        return x;
    }

}
