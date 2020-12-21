package inheritance_java.exercises.point_moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = new float[2];
        return arr;
    }

    @Override
    public String toString(){
//        return "x = " + super.getX() + "y = " + super.getY() + " speed = (" +getxSpeed() + "," + getySpeed() + ")";

        return super.toString() + " speed = (" +getxSpeed() + "," + getySpeed() + ")";
    }

    public MovablePoint move(){
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+xSpeed);
        return this;
    }
}
