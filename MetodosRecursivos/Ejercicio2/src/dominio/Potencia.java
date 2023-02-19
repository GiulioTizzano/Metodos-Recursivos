package dominio;

public class Potencia {
    int exponente;
    int base;
    // defino una función que recibe dos parámetros, la base y el exponente.
    // Guardamos el resultado de la operación recursiva en una variable.
    public static int potencia(int base, int exponente){
        
        /*if((exponente) == 1){
            return base;
        } */
        // El código es más eficiente con el caso base con el exponente igual a 0
        if(exponente == 0){
            return 1;
        }
        else{
            return base * potencia(base, exponente - 1);
        }
    }   
 }
    

