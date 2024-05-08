package Oops;

public class bankAccount {


    private String accountNumber;
    private String accountHolder;
    private int balance;


    public bankAccount(int balance , String accountNumber , String accountHolder){
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }

    public void withDraw(int amount){
        balance = balance-amount;
    }

    public int getBalance(){
        return balance;
    }

    public void displayAccountInfo(){

        System.out.println("account Number is : " + accountNumber);
        System.out.println("account Holder Name is : " +  accountHolder);
        System.out.println("account balance is : " + balance);
    }


    public static void main(String[] args) {
        bankAccount obj = new bankAccount(0 ,"151336465545511",  "chandraprakash sahu");

        obj.deposit(100);
        obj.deposit(200);
        obj.withDraw(50);
        obj.deposit(500);
        System.out.println("Total Balance is : "+ obj.getBalance());
     
    }  
}
