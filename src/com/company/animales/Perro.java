package com.company.animales;

public class Perro extends Animal implements Mascota,Mamiferos {

    private int patas;
    private int cola;

    public Perro (String nombre) {
        super("nombre");
    }

    @Override
    public void jugar () {

        System.out.println("Estoy jugando");
    }

    @Override
    public void dormir() {
        System.out.println("ZZZZZ");
    }

    @Override
    public void hablar() {
        System.out.println("Guafff");
    }

    public void ladrar () {
        System.out.println("Estoy ladrando");
    }

    @Override
    public void comer () {
        System.out.println("Comiendo croquetas");
    }

    @Override
    public void respirar () {
        System.out.println("Respirando por la naricita");
    }

    @Override
    public void gestar() {
        System.out.println("Tiempo de 2 meses");
    }

    @Override
    public void ingestaLeche() {
        System.out.println("Estoy tomando leche");
    }

    @Override
    public void movilidad() {
        System.out.println("Camino en 4 patas");
    }
}
