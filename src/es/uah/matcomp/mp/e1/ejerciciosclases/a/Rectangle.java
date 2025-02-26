package es.uah.matcomp.mp.e1.ejerciciosclases.a;

public class Rectangle {
    private float lenght;
    private float width;

    public Rectangle(){
        this.lenght = 1.0f;
        this.width = 1.0f;
    }
    public Rectangle(float lenght, float width){
        this.lenght = lenght;
        this.width = width;
    }
    public float getLenght() {
        return lenght;
    }
    public void setLenght(float lenght) {
        this.lenght = lenght;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return lenght * width;
    }
    public double getPerimeter(){
        return 2 * lenght * width;
    }
    public String toString(){
        return "Rectangle [lenght=" + lenght + ", width=" + width + "]";
    }
}
