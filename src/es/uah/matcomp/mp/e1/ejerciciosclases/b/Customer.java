package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class Customer {
    public static String info;
    public int id;
    public String name;
    public char gender;
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }

    public String getName() {
            return name;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return name + "(" + id + ") ";
    }
}
