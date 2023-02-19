package dominio;

public class Factorial {
    public static int factorial(int factorial){
        if(factorial == 1){
            return 1;
        } else{
            return factorial * factorial(factorial - 1);
        }
        
    }
}
