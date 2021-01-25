package exception.exercise;

public class IllegalTriangleException {
    public static void main(String[] args) {
        System.out.println("Enter a");
        System.out.println("Enter b");
        System.out.println("Enter c");

    }

    public class NegativeException extends Exception {
        public NegativeException(String msg){
            super(msg);
        }
    }


}
