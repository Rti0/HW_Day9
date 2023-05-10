public class Main {


    public static void main(String[] args) {
        MovablePoint m= new MovablePoint(3,4,-3,5);

        m.moveUp();
        m.moveDown();
        m.moveLeft();
        m.moveRight();

        MovablePoint R=new MovablePoint(1,3,5,2);

        R.moveUp();
        R.moveDown();
        R.moveLeft();
        R.moveRight();
    }
}