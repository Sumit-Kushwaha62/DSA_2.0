
// ############################## HOW TO TAKE THE USER INPUT IN JAVA #######################################



// import java.util.*;

// class input_output{ {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your name here!");

//         String name = sc.nextLine();

//         System.out.println("Hi " + name + " Welcome to Java Programming!");

//     }
// }



// ################################## TAKING INTEGER USER INPUT IN JAVA #########################################

import java.util.*;

class input_output{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first salary amount!");
        int salary = sc.nextInt();

        System.out.println("Enter your second salary amount!");
        int salary2 = sc.nextInt();

        int totalSalary = salary + salary2; 
        System.out.println("Your total salary is: " + totalSalary);
    }
}