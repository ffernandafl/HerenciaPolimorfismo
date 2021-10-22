package com.company;

import com.company.animales.Animal;
import com.company.animales.Ave;
import com.company.animales.Perro;
import com.company.uber.ConductorUberBlack;
import com.company.uber.UberDriver;

public class Main {

    public static void main(String[] args) {

//        Ave ave = new Ave("Petirrojo");
//        System.out.println(ave.getNombre());
//        Ave ave2 = new Ave ();
//        Ave ave3 = new Ave ("piolin", 2);
        //ave.comunicarse();
        //ave.hacerNido();
        //ave.comer();

//        System.out.println("------------------");
//
//        Perro lomito = new Perro ("paris");
        //lomito.jugar();
        //lomito.comer();

//        Animal animal = new Animal ();
//        animal.comer();
//        animal.hacerNido();

        //EJERCICIO

        UberDriver Joao = new UberDriver();
        ConductorUberBlack Juan = new ConductorUberBlack();
        Juan.setRatePerKm(3);

        System.out.println("Uber");
        System.out.println(Joao.calculatePrice(6));
        System.out.println("UberBlack");
        System.out.println(Juan.calculatePrice(6));
    }



}
