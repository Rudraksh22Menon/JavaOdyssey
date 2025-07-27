import java.util.Scanner;
import java.util.*;

public class Palindrome{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String userInput = sc.next();
        String reverse="";
        for(int i=userInput.length()-1;i>=0;i--){
            reverse=reverse+userInput.charAt(i);
        }
        if(userInput.toLowerCase().equals(reverse.toLowerCase())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}