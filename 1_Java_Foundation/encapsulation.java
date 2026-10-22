
class BankAccount {

    private double balance;

    // Getter:
    public double getBlance(){
        return balance;
    }

    // Setter:
    public void deposit (double amount){
        if(amount  > 0 ){
            balance = balance+amount;
        }

        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBlance());
        
        }
}



public class encapsulation {


    public static void main(String[] args) {
        
    }
}
