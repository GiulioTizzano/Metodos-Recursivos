package dominio;
import aplicacion.*;
import java.lang.*;

public class CocienteFibonacci {
    public static double cocienteFibonacci(){
        return (double) FibonacciRecursivo.secuenciaFibonacci(13) / FibonacciRecursivo.secuenciaFibonacci(12);
    }
}
