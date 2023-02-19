package dominio;
import aplicacion.*;
import java.util.*;

public class DadaUnaListaDeNumerosPares{
    public static ArrayList<Integer> pares_lista(int [] array3, ArrayList<Integer> lista_pares){
        if(array3.length == 0){
            return lista_pares;
        } else if(array3[0] % 2 == 0){
            lista_pares.add(array3[0]);
        }
        return pares_lista(Arrays.copyOfRange(array3, 1, array3.length), lista_pares);
        
    }
}
