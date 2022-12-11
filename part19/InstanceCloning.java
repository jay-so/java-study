package part19;
class Point implements Cloneable{
    private int xPos;
    private int yPos;

    //생성자
    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void showPosition(){
        System.out.printf("[%d, %d]",xPos,yPos);
        System.out.println();
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class InstanceCloning{
    public static void main(String[]args){
        Point org = new Point(3,5);
        Point cpy;

        try{
             cpy = (Point) org.clone();
             org.showPosition();
             cpy.showPosition();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
