package part19;
class Point implements Cloneable{
    private int xPos;
    private int yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    public void showPosition(){
        System.out.printf("[%d, %d]",xPos,yPos);
        System.out.println();
    }

    public void changePos(int x, int y){
        xPos = x;
        yPos = y;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


public class InstanceCloning {
    public static void main(String[]args){
        Point org = new Point(3,5);
        Point cpy;

        try{
            cpy = (Point) org.clone();
            org.showPosition();
            cpy.showPosition();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
