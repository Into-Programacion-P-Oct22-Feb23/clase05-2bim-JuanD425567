/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        Scanner entrada = new Scanner(System.in);
        int tamanio;
        System.out.println("Ingrese el tamanio del arreglo");
        tamanio = entrada.nextInt();
        int arreglo[] = new int[tamanio];
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("Ingrese el valor para la posicion %d\n", i);
            int dato = entrada.nextInt();
            arreglo[i]=dato;
            
            
        }
        int resultado;
        resultado = misterio(arreglo, tamanio);
        System.out.printf("El resultado es %s\n",resultado);
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
