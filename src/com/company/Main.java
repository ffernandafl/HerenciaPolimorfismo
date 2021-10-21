package com.company;

import com.company.animales.Animal;
import com.company.animales.Ave;
import com.company.animales.Perro;

public class Main {

    public static void main(String[] args) {

        Ave ave = new Ave("Petirrojo");
        System.out.println(ave.getNombre());
        Ave ave2 = new Ave ();
        Ave ave3 = new Ave ("piolin", 2);
        //ave.comunicarse();
        //ave.hacerNido();
        //ave.comer();

        System.out.println("------------------");

        Perro lomito = new Perro ("paris");
        //lomito.jugar();
        //lomito.comer();

//        Animal animal = new Animal ();
//        animal.comer();
//        animal.hacerNido();

    }
}
