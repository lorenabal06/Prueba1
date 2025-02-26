package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class Cliente {
    public int id;
    public String name;
    public int discount;
    public Cliente(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}
