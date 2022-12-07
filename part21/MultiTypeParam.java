package part21;
class DBox<L,R>{
    private L left; //왼쪽 수납 공간
    private R right; //오른쪽 수납 공간

    public void set(L o, R r){
        this.left = o;
        this.right = r;
    }

    @Override
    public String toString(){
        return left + " & " + right;
    }
}

class MutiTypeParam{
    public static void main(String[]args){
        DBox<String,Integer> box = new DBox<>();
        box.set("Apple",25);
        System.out.println(box);
    }
}
