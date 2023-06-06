package part7;

class BankAccount5{
    String accNumber; //계좌번호
    String ssNumber; //주민번호
    int balance; //예금 잔액

    //생성자
    public BankAccount5(String acc, String ss, int bal){
        this.accNumber = acc;
        this.ssNumber = ss;
        this.balance = bal;
    }

    //입금을 담당하는 메서드
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    //출금을 담당하는 메서드
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    //입,출금 내역을 확인하는 메서드
    public int checkMyBalance(){
        System.out.println("계좌번호 : " + accNumber);
        System.out.println("주민번호 : " + ssNumber);
        System.out.println("잔  액  : " + balance);
        return balance;
    }

}

public class BankAccountConstructor {
    public static void main(String[] args) {
        BankAccount5 yoon = new BankAccount5("12-34-89","990990-9090990",10000);
        BankAccount5 park = new BankAccount5("33-55-09","770088-5959007",10000);

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.deposit(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
