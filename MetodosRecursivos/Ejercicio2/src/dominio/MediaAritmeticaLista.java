package dominio;
import aplicacion.*;
import java.util.*;

public class MediaAritmeticaLista{
    public static float mediaAritmeticaElementos(float [] array){
            return SumaElementosLista.sumaElementosArray(array, array.length - 1) / array.length;
    }
    
}
