package se.hkr.task1;

public class ChocolatePiece {
    private String shape;
    private int weight;
    private boolean eaten = false;

    public ChocolatePiece(String shape, int weight){
        this.shape = shape;
        this.weight = weight;
    }

    public  String getShape(){
        return this.shape;
    }

    public  int getWeight(){
        return this.weight;
    }

    public void setEaten(boolean eaten){
        this.eaten = eaten;
    }

    public  boolean isEaten(){
        return this.eaten;
    }

}
