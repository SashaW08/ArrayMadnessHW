public class Pasta {
    private String shape;
    private int pounds;
    private boolean hasSauce;

    public Pasta(int ppounds){
        pounds = ppounds;
        shape = "spaghetti";
        hasSauce = true;
    }

    public void printInfo(){
        System.out.println("Pasta shape: "+shape+", pasta pounds: "+pounds+", pasta sauce: "+hasSauce);
    }

    public String getShape(){
        return shape;
    }

    public int getPounds(){
        return pounds;
    }

    public boolean getHasSauce(){
        return hasSauce;
    }

    public void setShape(String vshape){
        shape = vshape;
    }

    public void setpounds(int vpounds){
        pounds = vpounds;
    }

    public void sethassauce(boolean vhassauce){
        hasSauce = vhassauce;
    }

}
