public class nwdnww {
    public static int NWD(int a, int b){
        if(b==0){
            return a;
        }else {
            return NWD(b,a%b);
        }
    }
    public static int NWW(int a, int b){
        return a*b/NWD(a,b);
    }
}