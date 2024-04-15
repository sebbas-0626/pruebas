package com.sebastian;

import java.util.ArrayList;

public class Seleccion {
//    variable
//    comportamiento
//    tipos de datos primitivos
//    int,byte,short,long, float, bouble, boolean, char

    String nombreEquipo;
    char grupo;
    boolean clasifcadoACuartos;

    void imprimirEquipo(){
        System.out.println(nombreEquipo);
        System.out.println(grupo);
        System.out.println(clasifcadoACuartos);
    }

    public static void main(String[] args) {

        Seleccion argentina = new Seleccion();
        argentina.nombreEquipo = "Argentina";
        argentina.grupo = 'C';
        argentina.clasifcadoACuartos = true ;

        argentina.imprimirEquipo();

//        if statement
        if (argentina.clasifcadoACuartos == true){
            System.out.println("clasificados if");
        }else if (argentina.clasifcadoACuartos == false){
            System.out.println("no clasificado");
        }
//        bucle - loops
//        for-loop
        for (int i =1; i<10; i++){
            System.out.println("asiento" + i);
        }

//        whilw loop

        int j = 0;
        while (j<11){
            System.out.println("asiento:" + j);
            j++;
        }


//        excepciones

        int x = 0;
        int z = 5;

        try {
            System.out.println(x/z);
        }catch (Exception exception){
            System.out.println("imposible dividir por cero");
        }

//        API

ArrayList<String> selecciones = new ArrayList<>();
        selecciones.add("Francia");
        selecciones.add("inglaterra");
        selecciones.add("Brasil");
        selecciones.add("Colombia");

        System.out.println(selecciones);
    }

}
