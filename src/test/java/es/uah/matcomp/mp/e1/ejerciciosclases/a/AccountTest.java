package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void getId() {
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Account prueba = new Account("hola", "mundo");
        assertEquals("hola", prueba.getName());
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
    }

    @org.junit.jupiter.api.Test
    void credit() {
    }

    @org.junit.jupiter.api.Test
    void debit() {
    }

    @org.junit.jupiter.api.Test
    void transferTo() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}