public class Fibonacci {
    public static void liczeniefibonacci(int n){
        System.out.print("Pierwsze "+ n +" liczb ciągu Fibonacciego to: ");
        int num1=0;
        int num2=1;
        for(int i=0;i<n;i++){
            System.out.print(num1+", ");
            int next=num1+num2;
            num1=num2;
            num2=next;
        }
    }
}
