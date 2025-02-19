import javax.sql.rowset.spi.TransactionalWriter;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

class bankfun{

    String name;
    int bankId;
    int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public bankfun(String name, int bankId, int balance) {
        this.name = name;
        this.bankId = bankId;
        this.balance = balance;
    }
}



class Transactions extends bankfun{

    int Damount;
    int Wamount;

    public Transactions(String name, int bankId, int balance) {
        super(name, bankId, balance);
    }

    public void balanceEnq(){
            System.out.println("your current balance :" +getBalance());
        }
    public void deposit(int Damount){
        if(Damount>=0){
            balance = balance+Damount;
            System.out.println("transaction successful");
            System.out.println("final balance " +getBalance());
        }else System.out.println("amount should be greater than 0");

    }
    public void withdrawal(int Wamount){
        if(Wamount>=0){
            if(balance-Wamount>=0){
                balance=balance-Wamount;
                System.out.println("transaction successful");
                System.out.println("final balance "+getBalance());
            }else System.out.println("insufficient balance");

        }else System.out.println("amount should be a positive number");
    }

    public Transactions(String name, int bankId, int balance, int Damount, int Wamount) {
        super(name, bankId, balance);
        this.Damount = Damount;
        this.Wamount = Wamount;
    }
}

public class Bank{

    public Bank(String name, int bankId, int balance) {
    }

    public static void main(String[] args) {

        ArrayList<Transactions> transactionList = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter bank name :" );
        String name = scanner.nextLine();

        System.out.println("enter bank id :");
        int bankId = scanner.nextInt();

        System.out.println("current balance : ");
        int balance = scanner.nextInt();

        Transactions tra = new Transactions(name,bankId,balance);
        transactionList.add(tra);
        int input = 0;

       do {

            System.out.println("choose next action");
            System.out.println("1. balance enquiry");
            System.out.println("2. deposit");
            System.out.println("3. withdrawal");
            System.out.println("4. end transaction");

            input = scanner.nextInt();


            switch (input) {

                case 1:
                    System.out.println("current balance: " + balance);
                    break;

                case 2:
                    System.out.println("enter the amount to be deposited : ");
                    int Damount = scanner.nextInt();
                    tra.deposit(Damount);
                    break;

                case 3:
                    System.out.println("enter the amount to be withdrawn : ");
                    int Wamount = scanner.nextInt();
                    tra.withdrawal(Wamount);
                    break;
                case 4:
                    System.out.println("transaction ended");
                    break;

                default:
                    System.out.println("invalid choice");
                    break;
            }

        }while ( input!=4);

    }
}

