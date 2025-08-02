import java.util.Scanner;

public class LinearSearch {
    public static int search(int a[] ,int n, int key){
        for(int i=0;i<n;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key= sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = search(a, n,key);
        if (ans != -1) {
            System.out.println("index:" + ans);
        } else {
            System.out.println("no element found");
        }
    }
}
