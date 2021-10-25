package ru.mirea.practice.practice3.shape;

public class Square extends Rectangle{
    public Square(){
        super(1,1,"blue", false);
    }
    public Square(double side){
        super(side,side,"blue", false);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        setSide(side);
    }
    @Override
    public void setWidth(double side){
        setSide(side);
    }
    @Override
    public String toString(){
        return "Shape: square, side:"+this.width+", color: "+ this.color;
    }
}
