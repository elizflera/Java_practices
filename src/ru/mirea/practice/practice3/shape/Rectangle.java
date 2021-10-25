package ru.mirea.practice.practice3.shape;

public class Rectangle extends ru.mirea.practice.practice3.shape.Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        width=1;
        length=1;
        color="blue";
        filled=false;
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
        color="blue";
        filled=false;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public String toString(){
        return "Shape: rectangle, width and length:" + this.width+","+ this.length+ ", color:" + this.color;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2*width+2*length;
    }
}
