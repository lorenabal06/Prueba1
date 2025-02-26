package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class TestPruebaMyLine {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(0, 0, 3, 4);
        MyLine l2 = new MyLine(1, 1, 4, 5);

        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);

        System.out.println("Length of l1: " + l1.getLength());
        System.out.println("Gradient of l1: " + l1.getGradient());

        System.out.println("Length of l2: " + l2.getLength());
        System.out.println("Gradient of l2: " + l2.getGradient());
    }
}