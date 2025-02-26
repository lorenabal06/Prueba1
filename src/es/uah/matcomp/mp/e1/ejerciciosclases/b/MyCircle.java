package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class MyCircle {
    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;
    public MyCircle() {
    }
    public MyCircle (int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    public MyCircle (MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX() {
        return center.getX();
    }
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    public int getCenterY() {
        return center.getY();
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    public int getCenterXY() {
        return new MyPoint(center.getX(), center.getY()).getX();
    }
    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center.toString() + "]";
    }
}
