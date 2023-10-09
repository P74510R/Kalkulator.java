import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args){
        Scanner sil = new Scanner(System.in);
        System.out.println("Co chcesz zrobić:");
        System.out.println("1.Policzyć silnie.");
        System.out.println("2.Poznać N liczbe w ciągu Fibonacciego.");
        System.out.println("3.Obliczyć miejsca zerowe funkcji kwadratowej.");
        int wybor= sil.nextInt();
        if(wybor==1){
            System.out.println("Podaj stopień silnii: ");
            int m = sil.nextInt();
            Silnia.liczeniesilnii(m);
        } else if (wybor==2) {
            System.out.println("Podaj wspolczynnik N: ");
            Scanner N = new Scanner(System.in);
            int n = N.nextInt();
            Fibonacci.liczeniefibonacci(n);
        } else if (wybor==3) {
            System.out.println("Podaj pierwszy wspolczynnik: ");
            Scanner pier = new Scanner(System.in);
            double a = pier.nextDouble();
            System.out.println("Podaj drugi wspolczynnik: ");
            Scanner drug = new Scanner(System.in);
            double b = drug.nextDouble();
            System.out.println("Podaj trzeci wspolczynnik: ");
            Scanner trz = new Scanner(System.in);
            double c = trz.nextDouble();
            Funkcja.liczeniefunkcji(a,b,c);
        }

    }
}
