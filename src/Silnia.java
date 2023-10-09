public class Silnia {
public static void liczeniesilnii(int m){
    long sil = 1;
    for(int i=2;i<=m;i++){
        sil = sil*i;
        }
    System.out.println("Silnia stopnia " + m +" jest równa: " + sil);
    }
}
