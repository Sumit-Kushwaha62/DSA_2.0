
/*

1. count all digit of a number
2. count number of odd digits in a number
3. reverse a number 
4. palindrome number
5. return the lagest digit in a number
6. Factrorial of a given number
7. check  if the number is armstrong
8. check for perfect number
9. check for the perfect number
10. check for the prime number
11. count of prime numbers till N
12. GCD of Two Numbers
13. LCM of two numbers
14. Divisors of a number 






*/

public class armstrong_number {

public static boolean isReverse(int n){
        int rev = 0;
        int original = n;
        int sum = 0; 

        while (n != 0) {
            int store = n%10;
            sum = store*store*store + sum;
            rev = (rev * 10) + store;
            n = n/10;
        }

return (rev == original);


    public static void main(String[] args) {
        
    }
}
