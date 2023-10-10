import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args){
        Scanner sil = new Scanner(System.in);
        System.out.println("Co chcesz zrobić.");
        System.out.println("1.Podstawowe dzialania(dodawanie,odejmowanie mnozenie,dzielenie,potegowanie)");
        System.out.println("2.Policzyć silnie.");
        System.out.println("3.Poznać N liczbe w ciągu Fibonacciego.");
        System.out.println("4.Obliczyć miejsca zerowe funkcji kwadratowej.");
        System.out.println("5.Obliczyc NWD(Najwiekszy wspolny dzielnik) lub NWW(najmniejsza wspolna wielokrotnosc) dwóch liczb");
        int wybor= sil.nextInt();
        if (wybor==1){
          System.out.println("Jakie dzialanie chcesz wykonac?");
          System.out.println("1.Dodawanie");
          System.out.println("2.Odejmowanie");
          System.out.println("3.Mnozenie");
          System.out.println("4.Dzielenie" );
          System.out.println("5.Potegowanie");
          int wybor2 = sil.nextInt();
          if(wybor2==1){
              System.out.println("Podaj pierwsza liczbe do dodania: ");
              int ab = sil.nextInt();
              System.out.println("Podaj druga liczbe do dodania: ");
              int bc = sil.nextInt();
              podstawowe_dzialania.dodawanie(ab,bc);
          } else if(wybor2==2){
                System.out.println("Podaj odjemna: ");
                int cd = sil.nextInt();
                System.out.println("Podaj odjemnik: ");
                int de = sil.nextInt();
                podstawowe_dzialania.odejmowanie(cd,de);
            } else if(wybor2==3){
                System.out.println("Podaj mnozna: ");
                int ef = sil.nextInt();
                System.out.println("Podaj mnoznik: ");
                int fg = sil.nextInt();
                podstawowe_dzialania.mnozenie(ef,fg);
            } else if(wybor2==4){
                System.out.println("Podaj dzielna: ");
                int gh = sil.nextInt();
                System.out.println("Podaj dzielnik: ");
                int hi = sil.nextInt();
                podstawowe_dzialania.dzielenie(gh,hi);
            } else if(wybor2==5){
                System.out.println("Podaj podstawe potegi: ");
                int ij = sil.nextInt();
                System.out.println("Podaj wykladnik potegi: ");
                int jk = sil.nextInt();
                podstawowe_dzialania.potegowanie(ij,jk);
            }
            else {
              System.out.println("Nie ma takiej opcji;");
            }
        } else if(wybor==2){
            System.out.println("Podaj stopień silnii: ");
            int m = sil.nextInt();
            Silnia.liczeniesilnii(m);
        } else if (wybor==3) {
            System.out.println("Podaj wspolczynnik N: ");
            int n = sil.nextInt();
            Fibonacci.liczeniefibonacci(n);
        } else if (wybor==4) {
            System.out.println("Podaj pierwszy wspolczynnik: ");
            double a = sil.nextDouble();
            System.out.println("Podaj drugi wspolczynnik: ");
            double b = sil.nextDouble();
            System.out.println("Podaj trzeci wspolczynnik: ");
            double c = sil.nextDouble();
            Funkcja.liczeniefunkcji(a,b,c);
        } else if (wybor==5) {
            int wybor3;
            System.out.println("Co chcesz zrobić?");
            System.out.println("1.Obliczyć NWD");
            System.out.println("2.Obliczyć NWW");
            wybor3 = sil.nextInt();
            if (wybor3==1){
                System.out.println("Podaj pierwsza liczbe: ");
                int a = sil.nextInt();
                System.out.println("Podaj druga liczbe: ");
                int b = sil.nextInt();
                System.out.println(nwdnww.NWD(a,b));
            } else if (wybor3==2){
                System.out.println("Podaj pierwsza liczbe: ");
                int a = sil.nextInt();
                System.out.println("Podaj druga liczbe: ");
                int b = sil.nextInt();
                System.out.println(nwdnww.NWW(a,b));
            } else {
                System.out.println("Nie ma takiej opcji;");
            }
        } else {
            System.out.println("Nie ma takiej opcji;");
        }
    }
}
