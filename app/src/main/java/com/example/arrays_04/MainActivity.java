package com.example.arrays_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Declaración de un Arreglo (Array)

        /*
          1.Tipo de dato
          2.Se agregan []
          3.Nombre del arreglo
          4.1. Se define los valores que almacenara dentro de {} y separados por ,
          4.2. Se define su tamaño
          Nota: El tamaño de un arreglo no se puede modificar
          una vez creado
         */
        //Arreglo de números
        //Los arreglos inician en la posición 0
        //p0->10 p1->65 p2->88 p3->96 p4->100 p5->5 p6->2 p7->47
        int [] numeros= {10,65,88,96,100,5,2,47};
        numeros[3]=14;
        numeros[5]=numeros[4]*numeros[6];
        //{10,65,88,14,100,200,2,47}

        //Arreglo de nombres
        String [] nombres= new String[5];//tamaño entero normal
        //posiciones de 0 a tamaño-1
        nombres[0]="Adriana";
        nombres[1]="Luis";
        nombres[2]="Camila";
        nombres[3]="Jose";
        nombres[4]="Diana";

        System.out.println(nombres.length);
        System.out.println(nombres[4]);

        // "Luis;30;1.70;87412369;M;Colombia;Caldas;Manizales"
        String cadena="Luis;30;1.70;87412369;M;Colombia;Caldas;Manizales";
        String [] datos= cadena.split(";");

        System.out.println(datos[5]);
        System.out.println(datos);

        //Cuando se quiere llamar a los metodos de una clase se debe definir una variable de dicha clase
        Sobrecarga ejemplo= new Sobrecarga();
        double imc=ejemplo.imc(50,1.70);
        //Cuando se quiere llamar a las funciones de una clase, se nombra la clase y se coloca . y se selecciona la función
        Sobrecarga.PruebaClaseMath();
        Sobrecarga.PruebaClaseArrays();


    }
}