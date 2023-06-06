package part7;

class BankAccount{
    int balance = 0; //예금 잔액

    //입금을 담당하는 메소드
    public int deposit(int amount){
        balance += amount;
        return balance;
    }

    //출금을 담당하는 메소드
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }

    //통장 잔고를 확인하는 메소드
    public int checkMyBalacne(){
        System.out.println("잔액 : " + balance);
        return balance;
    }
}



public class BankAccountOO {
    public static void main(String[] args) {
        //2개의 인스턴스 생성
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();

        //각 인스턴스를 대상으로 예금을 진행함
        yoon.deposit(5000);
        park.deposit(3000);

        //각 인스턴스를 대상으로 출금을 진행함
        yoon.withdraw(2000);
        park.withdraw(2000);

        //각 인스턴스를 대상으로 잔액을 조회함
        yoon.checkMyBalacne();
        park.checkMyBalacne();
    }


}
