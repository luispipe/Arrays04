package com.example.arrays_04;

import java.util.Arrays;

public class Sobrecarga {

    /*La sobrecarga de metodos es definir varios metodos con el mismos nombre
      pero con diferentes parametros de entrada y la lógica puede o no ser diferente
     */

    // imc(Double valor1,Double valor2)
    public double imc (double peso, double altura){
        return (peso/(altura*altura));
    }
    //imc(Double valor1,Double valor2,String valor3)
    public void imc (double peso, double altura, String nombre){
        double calculoIMC= (peso/(altura*altura));
        System.out.println("El usuario "+nombre+" tiene un imc de "+calculoIMC);
    }

    public int imc(int peso,int altura){
        return peso/(altura*altura);
    }

    public String imc(String peso,String altura){
        double pesoD= Double.parseDouble(peso);
        double alturaD=Double.parseDouble(altura);
        return pesoD/(alturaD*alturaD)+"";
    }

    public static void PruebaClaseMath(){
        int valor1=56;
        int valor2=33;
        double valor3=95.7;
        double valor4= 112.48;
        //Metodo para elevar un número a una potencia es pow
        double cubo= Math.pow(5,3);
        //Metodo random nos genera un número aleatorio entre 0 y 1
        double aleatorio= Math.random();
        System.out.println(aleatorio);
        //Metodo para calcular la raiz cuadrada de un número
        double raiz= Math.sqrt(valor3);
        System.out.println(raiz);
        //La clase Math tiene las constantes matemáticas PI y Euler
        double areaCirculo= Math.PI*Math.pow(3,2);
        System.out.println(areaCirculo);
        //La clase Math tiene un metodo para calcular el valor máximo y minimo entre dos valores
            Math.max(valor1,valor2);
            Math.min(cubo,valor3);
    }
    //En java las funciones tienen la palabra static despues del nivel de acceso
    // y antes del tipo de dato
    protected static void PruebaClaseArrays(){
        int[] pares= {8,2,10,200,50,84,96,16};
        int[] primos= {29,2,13,1,97,3,5,7,11};
        //Metodo copyOf nos permite clonar el arreglo
        int[] copiaPares= Arrays.copyOf(pares,pares.length);
        System.out.println(Arrays.toString(copiaPares));
        //Metodo sort, nos permite ordenar de forma ascendente
        Arrays.sort(pares);
        System.out.println(Arrays.toString(pares));
        //Metodo equals para comparar si 2 arreglos son iguales
        boolean igual= Arrays.equals(pares,copiaPares);
        System.out.println(igual);

        //El metodo para buscar un elemento dentro de un arreglo es el binarySearch
        //Si el elemento existe devuelev la posición sino muestra un valor negativo
        Arrays.sort(primos);
        int result=Arrays.binarySearch(primos,97);
        System.out.println(result);
        int []segundaCopia=pares.clone();
    }







}
