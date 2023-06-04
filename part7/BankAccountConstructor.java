package part7;

class BankAccount5{
    String accNumber; //계좌 번호
    String ssNumber; //주민 번호
    int balance; //예금 잔액

    public BankAccount5(String accNumber, String ssNumber, int balance) {
        this.accNumber = accNumber;
        this.ssNumber = ssNumber;
        this.balance = balance;
    }
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public int checkMyBalance(){
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호: " + ssNumber);
        System.out.println("잔 액: " + balance + '\n');
        return balance;
    }

}

public class BankAccountConstructor {
    public static void main(String[]args){
        BankAccount5 yoon = new BankAccount5("12-34-89","990990-9090990",10000);// yoon의 계좌 생성

        BankAccount5 park = new BankAccount5("33-55-04","77088-595907",10000); // park의 계좌 생성

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
