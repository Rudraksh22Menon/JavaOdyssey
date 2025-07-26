import java.util.Scanner;
import java.util.*;

public class palindromeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int userInput= sc.nextInt();
        int originalNum=userInput;
        int reverse = 0,remainder=0;
        while(userInput!=0){
            remainder=userInput%10;
            reverse=reverse*10+remainder;
            userInput=userInput/10;
        }
        if(reverse==originalNum){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not a Palindrome number");
        }
    }
}
