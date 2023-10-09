import java.util.Scanner;
import static java.lang.Math.*;

public class Funkcja {
    public static void liczeniefunkcji(double a,double b,double c){
        double delta = b*b-(4*a*c);
        if(delta>0){
            double pdelty = sqrt(delta);
            double x_one=(-b-pdelty)/2*a;
            double x_two=(-b+pdelty)/2*a;
            System.out.println("Pierwiastki funkcji to: "+ x_one + ", " + x_two);
        } else if (delta==0) {
            double x = -b/2*a;
            System.out.println("Pierwiastkiem funkcji jest: "+ x);
        }
        else {
            System.out.println("delta mniejsza od zera");
        }
    }
}
