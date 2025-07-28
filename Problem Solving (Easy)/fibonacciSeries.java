import java.util.Scanner;

public class fibonacciSeries {

    public static void Fibonacci(int n){
        int n1=0, n2=1;
        for(int i =0;i<n;i++){
            System.out.println(n1+" ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        Fibonacci(n);
    }
}
