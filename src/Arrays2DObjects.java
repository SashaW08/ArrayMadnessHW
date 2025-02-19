public class Arrays2DObjects {

    public static void main(String[] args) {
        Arrays2DObjects arrays2dobjects = new Arrays2DObjects();
    }

    Pasta[][] pasta = new Pasta[3][4];

    public Arrays2DObjects(){
        System.out.println("Welcome to Pasta World");

        for(int r=0; r<pasta.length; r++){
            for(int c=0; c<pasta[r].length; c++){
                pasta[r][c] = new Pasta ((int)(Math.random()*101));
            }
        }

        printArray();
        System.out.println("The average amount of pasta is "+avgPoundsOfPasta()+" pounds.");

    }

    public void printArray(){
        for(int r=0; r<pasta.length; r++){
            for(int c=0; c<pasta[r].length; c++){
                pasta[r][c].printInfo();
            }
        }
    }

    public double avgPoundsOfPasta(){

        int x = 0;

        for(int r=0; r<pasta.length; r++){
            for(int c=0; c<pasta[r].length; c++){
                x=x+pasta[r][c].getPounds();
            }
        }

        x=x/(pasta.length*pasta[0].length);

        return x;
    }

}
