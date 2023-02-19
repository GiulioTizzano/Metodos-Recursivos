package dominio;
import aplicacion.Principal;

public class suma{
    static int m;
    public static int sumaEnteroPositivos(int m){
        
        if(m == 1){
            return 1;
        } else{
            return m + sumaEnteroPositivos(m - 1);
        }
        
    }
}