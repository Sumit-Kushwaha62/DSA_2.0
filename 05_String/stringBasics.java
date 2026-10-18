import java.util.*;

public class stringBasics {

    public static void input(String s) {
        System.out.println("Enter you String here:");

        System.out.println("The lenght of the string is " + s.length());
    }

    public static void index(String s){
        System.out.println("The first index is "+s.charAt(0) + " and the last index is "+ s.charAt(s.length()-1));
    }


    public static void upper(String s){
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }



    public static int count(String s){
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            
            if(s.charAt(i) != ' '){
                count++;
            }
        }
        
        return count;
    }

    public static void concatenated(String s1, String s2){
        String k = s1+s2;
        System.out.println("The concatination of both string is = "+ k);
        
    }


    public static void ASCII(String s){
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            System.out.println(ch + " = " + (int) ch);
        }
    }


    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here!");
        String s = sc.nextLine();

        // System.out.println("Enter you second value here!");
        // String s2 = sc.nextLine();
        
        ASCII(s);


        
        
    }
}
