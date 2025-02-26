package es.uah.matcomp.ed.e1.ejerciciosclases.a;

public interface Iterador<T> {
    boolean hasNext();
    T next();
    void remove();
}
