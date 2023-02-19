package dominio;
import aplicacion.*;

public class SumaElementosLista{
    int m;
    
    public static float sumaElementosArray(float[] array, int m){
        // si la posicion m del array es igual a 0, entonces devolvemos el valor de la posicion m (que es el índice 0).
        if(m == 0){
            return array[m];
        }
        // sino, devolvemos el valor de la posicion m del array, y le sumamos el valor de la posicion m - 1 del array hasta llegar
        // al paso base.
        else{
            return array[m] + sumaElementosArray(array, m - 1);
        }
        
    }

}