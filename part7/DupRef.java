package part7;

/*
 참조 변수의 특성
 변수는 저장된 값을 바꿀 수 있었다. 참조 변수도 마찬가지로 변수이다.
 따라서 참조변수도 참조하는 인스턴스를 바꿀 수 있다.
 BankAccount yoon = new BankAccount();

 yoon = new BankAccount();

 또한 참조변수가 가지고 있는 값을 다른 참조 변수에 대입하여 하나의 인스턴스를 둘 이상의 참조변수가 동시에 참조하는 것도 가능하다.
 Bank Account ref1 = new BankAccount();
 Bank Account ref2 = ref1;
 */
class  BankAccount2{
    int balance = 0;

    public int deposit(int amount){
        balance += amount;
        return balance;
    }

    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }

    public int checkMyBalance(){
        System.out.println("잔액: " + balance);
        return balance;
    }
}



public class DupRef {
    public static void main(String[]args){
        BankAccount2 ref1 = new BankAccount2();
        BankAccount2 ref2 = ref1; //ref1이 참조하는 대상을 ref2도 참조

        ref1.deposit(3000);
        ref2.deposit(2000);
        ref1.withdraw(400);
        ref2.withdraw(300);
        ref1.checkMyBalance();
        ref2.checkMyBalance();

    }
}
