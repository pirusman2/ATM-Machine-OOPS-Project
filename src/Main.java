import java.util.Scanner;

class ATM{

    int Pin = 1122;
    float Balance;

    public void checkPin(){
        System.out.println("Enter Pin");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == Pin){
            menu();
        }
        else {
            System.out.println(" Pin is Incorrect: " );
            menu();
        }

    }

    public void menu(){
        System.out.println("Enter your Choice: ");
        System.out.println("1. Check Balance: ");
        System.out.println("2. Withdraw Money: ");
        System.out.println("3. Deposit Money: ");
        System.out.println("4. Exit: ");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1){
            checkBalance();

        } else if (opt == 2) {
            withdrawMoney();

        } else if (opt == 3) {
            depositMoney();

        } else if (opt == 4) {
            return;
        }

        else {
            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance(){
        System.out.println("Balance is: "+Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount>Balance){
            System.out.println("Insufficient Balance in Account: ");
        }
        else {
            Balance = Balance - amount;
            System.out.println("Amount Withdrawn: ");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter Money to Deposit");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = amount + Balance;
        System.out.println("Money is Deposited: ");
        menu();
    }

}




public class Main {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkPin();

    }
}
