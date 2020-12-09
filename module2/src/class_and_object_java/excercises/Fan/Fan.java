package class_and_object_java.excercises.Fan;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    private int speed = SLOW;

    private boolean on = false ;

    private double radius = 5;

    private String color = "blue";

    public Fan(){

    }

    public Fan(int Speed, double radius, String color, boolean on ){
        this.speed = Speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public static int getSLOW() {
        return SLOW;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if(on == true){
            return "Speed: " + speed + ";Color: " + color + ";radius: "+ radius + "||Fan is on";
        }else{
            return "Speed: " + speed + ";Color: " + color + ";radius: "+ radius + "||Fan is off";

        }
    }



}
