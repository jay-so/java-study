package part19;
class INum{
    private int num;
    //생성자

    public INum(int num) {
        this.num = num;
    }
    @Override
    public boolean equals(Object obj){
        if(this.num == ((INum)obj).num)
            return true;
        else
            return false;
    }
}

class ObjectEquality{
    public static void main(String[]args){
        INum num1 = new INum(10);
        INum num2 = new INum(12);
        INum num3 = new INum(10);

        //인스턴스 비교
        if(num1.equals(num2))
            System.out.println("num1, num2의 내용이 동일하다.");
        else
            System.out.println("num1, num2의 내용이 다르다.");

        if(num1.equals(num3))
            System.out.println("num1, num3의 내용이 동일하다.");
        else
            System.out.println("num1, num3의 내용이 다르다.");
    }
}