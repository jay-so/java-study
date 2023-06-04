package part7;

class BankAccount{
    int balance = 0; //예금 잔액

    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public int checkMyBalance(){
        System.out.println("잔액 : " + balance);
        return  balance;
    }
}



public class BankAccountOO {

    public static void main(String[] args) {
        //2개의 인스턴스 새엇ㅇ
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();

        //각 인스턴스를 대상으로 예긂을 진행
        yoon.deposit(5000);
        park.deposit(3000);

        //각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        park.withdraw(2000);

        //각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
