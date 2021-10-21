package com.company.animales;

public class Ave extends Animal {

    private int alas;
    private int patas;
    private boolean vuela;

    public Ave () {
        super();
    }

    public Ave (String nombre) {
        super(nombre);
        System.out.println("Contructor hijo");
    }

    public Ave (String nombre, int edad) {
        super(nombre, edad);
        System.out.println("Contructor hijo");
    }

    public void hacerNido () {
        System.out.println("Estoy haciendo mi nido");
    }

    public void ponerHuevo () {
        System.out.println("Estoy poniend un huevo");
    }

    @Override
    public void comer () {
        System.out.println("Comiendo alpiste");
    }

    @Override
    public void respirar () {
        System.out.println("Respirando por el pico");
    }
}
