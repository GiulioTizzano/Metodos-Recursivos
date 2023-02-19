package dominio;
import aplicacion.*;
import java.util.*;

public class DesviacionTipica{
    public static float Desviacion(float [] array){
        return (float) Math.sqrt(MediaAritmeticaLista.mediaAritmeticaElementos(array));
    }

}
