public class podstawowe_dzialania {
    public static void dodawanie(int ab, int bc){
        int suma=ab+bc;
        System.out.println("Suma tych liczb to: "+ suma);
    }
    public static void odejmowanie(int cd, int de){
        int roznica=cd-de;
        System.out.println("Roznica tych liczb to: "+ roznica);
    }
    public static void mnozenie(int ef, int fg){
        int iloczyn = ef*fg;
        System.out.println("Iloczyn tych liczb to: "+ iloczyn);
    }
    public static void dzielenie(int gh, int hi){
        if(hi==0){
            System.out.println("no chyba kurde nie");
        }
        else {
            double iloraz = gh / hi;
            System.out.println("Iloraz tych liczb to: " + iloraz);
        }
    }
    public static void potegowanie(int ij, int jk) {
        int wynik = ij;
        if (jk == 0) {
            wynik = 1;
        } else if (jk > 0) {
            for (int m = 1; m < jk; m++) {
                wynik = wynik * ij;
            }
        } else {
            for (int m = 1; m < -jk; m++) {
                wynik = wynik * ij;
            }
            wynik = 1 / wynik;
        }
        System.out.println(wynik);
    }
}
