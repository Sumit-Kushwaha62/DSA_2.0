//package 5_String;
import java.util.*;

public class PalindromeCheck {


public static void print(String name){
    for(int i = 0; i<name.length(); i++){
        System.out.print(name.charAt(i));
    }
    System.out.println();
}



public static void test(String str){
    int n = str.length();
    for(int i = 0; i<n/2; i++){
        if(str.charAt(i) != str.charAt(n-i-1)){
            System.out.println("Not Palindrome");
            return; 
        }
    }
    System.out.println("Palindrome");
}






    public static boolean isPalindrom(String str){
        int n = str.length();
        for(int i =0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
               return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        String str =  "racecar";
        System.out.println(isPalindrom(str));

        String name = "Sumit Kushwaha";
        print(name);


    }
}
