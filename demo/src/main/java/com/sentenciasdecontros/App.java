package com.sentenciasdecontros;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // usando If
        int numeroIF = 5;

        if (numeroIF > 0){
            System.out.println("El numero es positivo" );
        }   else if (numeroIF < 0){
            System.out.println("El numero es negativo");
        }   else{
            System.out.println("El numero es 0");
        }
        

        // Bucle While
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }


        // Bucle Do While
        int numeroDoWhile = 0;

        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }   while (numeroDoWhile <3);

        // Bucle For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //Switch
        String estacion = "verano";

        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("El valor de la variable no es corresponde a una estacion");    
        }
    }  
}
