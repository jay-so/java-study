package part14;

class SuperCLS3{
    protected static int count = 0;

    public SuperCLS3() {
        count++;
    }
}

class  SubCLS3 extends SuperCLS3{
    public void showCount(){
        System.out.println(count);
    }
}

public class SuperSubStatic {
    public static void main(String[]args){
        SuperCLS3 obj1 = new SubCLS3();
        SuperCLS3 obj2 = new SubCLS3();

        SubCLS3 obj3 = new SubCLS3();
        obj3.showCount();
    }
}
