package dominio;
import aplicacion.*;

public class SumaNumerosParesLista{
    public static double sumaNumerosPares(double [] array2, int k){
        if(k == 2){
            return k;
        } else if(array2[k] % 2 == 0){
            return array2[k] + sumaNumerosPares(array2, k - 1);
        } else{
            return sumaNumerosPares(array2, k - 1);
        }
    }

}