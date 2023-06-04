package part7;

class BackAccount2{
    int balance = 0;

    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdarw(int amount){
        balance -= amount;
        return balance;
    }
    public int checkMyBalance(){
        System.out.println("잔액 : " + balance);
        return balance;
    }
}


public class DupRef {
    public static void main(String[] args) {
        BackAccount2 ref1 = new BackAccount2();
        BackAccount2 ref2 = ref1; //ref1이 참조하는 대상을 ref2도 참조

        ref1.deposit(3000);
        ref2.deposit(2000);
        ref1.withdarw(400);
        ref2.deposit(300);
        ref1.checkMyBalance();
        ref2.checkMyBalance();
    }

}
