public class MovablePoint implements Movable{
private int x;
private int y;
private int xSpeed;
private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }
    @Override
    public void moveUp() {

        y-=ySpeed;
        System.out.println("To moveUp:"+y);
    }

    @Override
    public void moveDown() {
        y+=ySpeed;
        System.out.println("To moveDown:"+y);
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
        System.out.println("To moveLeft:"+x);
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
        System.out.println("To moveRight:"+x);
    }
}
