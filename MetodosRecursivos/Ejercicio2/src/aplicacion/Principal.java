package aplicacion;
import dominio.*;
import java.util.*;
import java.lang.*;



public class Principal{
    public static void main(String[] args){
        System.out.println("La suma de los n elementos es " + suma.sumaEnteroPositivos(5));
        System.out.println("El factorial de un número n es: " + Factorial.factorial(5));
        System.out.println("La potencia de un número n es: " + Potencia.potencia(2, 5));
        float [] array = {1, 2, 3, 4, 5};
        System.out.println("La suma de elementos de un array de n elementos es: " + SumaElementosLista.sumaElementosArray(array, 4));
        System.out.println("La media aritmética del array de n elementos es: " + MediaAritmeticaLista.mediaAritmeticaElementos(array));
        // Revisar este:
        System.out.println("La desviación tipica de los n elementos del array: " + DesviacionTipica.Desviacion(array));
        double [] array2 = {1.1, 2, 3.3, 4, 5, 6, 7, 8, 9.5, 10};
        System.out.println("La suma de los n elementos pares de la lista es " + SumaNumerosParesLista.sumaNumerosPares(array2, 9));
        System.out.println("La suma de los n elementos pares es " + SumaPares.sumaPares(9));
        ArrayList<Integer> lista_pares = new ArrayList<Integer>();
        int [] array3 = {1, 2, 6, 11};
        System.out.println("La lista nueva conteniendo los numeros pares de otra lista es: " + DadaUnaListaDeNumerosPares.pares_lista(array3, lista_pares));
        // System.out.println("La lista de los primeros numeros pares hasta n, asumiendo n <= 2, es: " + PrimerosNumerosPares.primeros_pares(9, lista_pares));
        int [] array4 = {1, 2, 3};
        int [] array5 = {2, 4, 6};
        System.out.println("El producto escalar de los elementos de dos arrays es: " + ProductoEscalar.calcularProductoEscalar(array4, array5));
        System.out.println("La secuencia fibonacci para un numero n dado es: " + FibonacciRecursivo.secuenciaFibonacci(10));
        double resultado = ((1 + Math.sqrt(5)) / 2);
        System.out.println("El valor del cociente entre el décimo tercer elemento y décimo segundo elemento es: " + CocienteFibonacci.cocienteFibonacci() + " y que coincide con: " + resultado);
        System.out.println("La relacion entre la serie de Fibonacci y la razón áurea es que si divides cualquier término de la serie Fibonacci con otro término n - 1 más pequeño, se halla la razón áurea.");
    }



}