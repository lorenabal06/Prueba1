package es.uah.matcomp.ed.e1.ejerciciosclases.a;
import java.util.Arrays;
public class ListasBasicas<T> implements Lista<T> {
    @Override
    public boolean add(T elemento) {
        return false;
    }

    @Override
    public boolean remove(T elemento) {
        return false;
    }

    @Override
    public Iterador<T> getIterador() {
        return null;
    }

    @Override
    public int getNumElementos() {
        return 0;
    }

    int maxElementos;
    int numElementos;
    T[] elementos;

    public ListasBasicas(int maxElementos, int numElementos, T[] elementos) {
        this.maxElementos = maxElementos;
        this.numElementos = numElementos;
        elementos = (T[]) new Object[numElementos]; // Inicializa el array elementos, que contiene cualquier tipo de archivo
        this.elementos = elementos;
    }
}