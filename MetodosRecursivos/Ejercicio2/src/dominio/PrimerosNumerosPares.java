package dominio;
import aplicacion.*;
import java.util.*;

public class PrimerosNumerosPares{
    public static ArrayList<Integer> primeros_pares(int x, ArrayList<Integer> lista_pares){
        if(x < 2){
            return lista_pares;
        } else if(x % 2 == 0){
            lista_pares.add(x);
        }
        return primeros_pares(x - 1, lista_pares);
    }
}