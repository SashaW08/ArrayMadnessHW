public class Arrays2D {

    public static void main(String[] args) {
        Arrays2D arrays2d = new Arrays2D();
    }

    int [] [] grid = new int [3] [4]; // first number is how many rows, second number refers to the amount of columns. 3 is row, 4 is column
    int t=0;

    public Arrays2D(){

        //System.out.println("welcome to grid world");
        //System.out.println(grid[0].length);

        method();

    }

    public void method(){

        for(int x = 0; x<grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                grid[x][y] = (int) (Math.random()*11);
                System.out.println(grid[x][y]);
                t=t+grid[x][y];
            }
        }

        t=t/((grid.length)*(grid[0].length));
        System.out.println("The average number in the 2D array is "+t);

    }

}
