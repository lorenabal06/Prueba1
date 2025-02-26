package es.uah.matcomp.ed.e1.ejerciciosclases.a;

public interface Lista <T> {
    boolean add (T elemento);
    boolean remove (T elemento);
    Iterador<T> getIterador();
    int getNumElementos();
}