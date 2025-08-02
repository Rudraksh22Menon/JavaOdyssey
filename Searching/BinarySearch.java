import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int search(int a[], int n, int key){
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(a[mid]==key){
                return mid;
            }else if(a[mid]>key){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int key=sc.nextInt();
        int ans= search(arr,n,key);
        if(ans!=-1){
            System.out.println("Index:"+ans);
        }else{
            System.out.println("no such element found");
        }
    }
}
