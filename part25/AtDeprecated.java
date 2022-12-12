package part25;
interface Viewable2{
    @Deprecated
    public void showIt(String str); //Deprecated 된 메소드

    public void brshowIt(String str);
}
class Viewer2 implements Viewable2{
    @Override
    public void showIt(String str){
        System.out.println(str);
    }

    @Override
    public void brshowIt(String str) {
        System.out.println('[' + str + ']');
    }
}

class AtDeprecated{
    public static void main(String[]args){
        Viewable2 view = new Viewer2();
        view.showIt("Hello Annotations");
        view.brshowIt("Hello Annotations");
    }
}
