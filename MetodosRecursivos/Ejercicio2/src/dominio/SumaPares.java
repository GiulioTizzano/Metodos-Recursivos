package dominio;
import aplicacion.*;

public class SumaPares{
    public static int sumaPares(int t){
        if(t < 2){
            return 0;
        } else if(t % 2 == 0){
            return t + sumaPares(t - 2);
        } else{
            return  + sumaPares(t - 1);
        }
    }



}