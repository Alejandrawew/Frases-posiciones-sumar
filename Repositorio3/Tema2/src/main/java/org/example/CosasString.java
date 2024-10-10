package org.example;

public class CosasString {
    public void caracteres() {

        String frase = "No me porto mal en clase y no lo reconozco.";


        int tamanyo = frase.length();
        System.out.println("El tamaño de mi frase es " + tamanyo);
        //chartart es para saber la posicion de mi frase//

        char letra = frase.charAt(13);
        System.out.println("La posición 33 es " + letra);

        String palabra = frase.substring(10, 13);
        System.out.println("La posición 10,13 es " + palabra);

        //para unir dos palabras//

        String frase2 = " parte ";
        String concanacion = frase.concat(frase2);
        System.out.println("La conquenación de la frase con la suma de la otra frase es " + frase2 + concanacion);

        int posicion = concanacion.indexOf(frase2);
        System.out.println("La palabra" + frase2 + " esta en la posicion " + posicion);

        //Buscar en la frase por ejemplo: " No "//

        int posicion2 = concanacion.indexOf("no", 8);
        System.out.println("La posición de No  si con las 8 posiciones" + posicion2);


        int posicion3 = concanacion.lastIndexOf("no ");
        System.out.println("La posición de la última aparición de la palabra 'no' es " + posicion3);

        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();
        System.out.println("La frase mayuscula es : " + mayusculas + " y la frase minuscula es : " + minusculas);

        String nombre = "Alejandra";
        nombre = nombre.trim();

        System.out.println("Tu nombre sin espacios es " + nombre);

        String reemplazar = frase.replace("mal", "bien");
        System.out.println(" La frase reemplazada de mal por bien es " + reemplazar);
        String reemplazar_espacios = reemplazar.replace(" ", "");
        System.out.println("La frase sin espacios " + reemplazar_espacios);
        String palabra3 = " hola";
        String palabra4 = " adios";
        if (palabra3.equals(palabra4)) {


            System.out.println("");
            System.out.println("las palabras" + palabra3 + "y " + palabra4 + " son iguales.");

        } else {
            System.out.println("");
            System.out.print("Las palabras " + palabra3 + "y" + palabra4 + " son distintas");

        }
    }

}