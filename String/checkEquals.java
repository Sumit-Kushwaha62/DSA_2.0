
/*
due to a memory management concepts we can't direcly check two strings are 
equal or not so for comparing the value of two string we usually used .equals method



*/
public class checkEquals {
    public static void main(String[] args) {


        String S1 = "sumit";
        String S2 = new String("sumit");

        System.out.println(S1.equals(S2));
        
    }
}
