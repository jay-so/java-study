package part7;

class BackAccount3{
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

    //입,출금을 확인하는 메소드
    public int checkMyBalance(){
        System.out.println("잔액 : " + balance);
        return balance;
    }
}


public class PassingRef {
    public static void main(String[] args) {
        BackAccount3 ref = new BackAccount3();
        ref.deposit(3000);
        ref.withdraw(300);
        check(ref);
    }

   public static void check(BackAccount3 acc){
        acc.checkMyBalance();
   }
}
