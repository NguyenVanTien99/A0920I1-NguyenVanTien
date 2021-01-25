package _15_exception;

import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public void readFile() {
        try {
            FileReader fileReader = new FileReader("path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int div() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        try {
            System.out.print("input a: ");
            int a = scanner.nextInt();
            System.out.print("input b: ");
            int b = scanner.nextInt();

            result = a / b;
            return result;
        } catch (ArithmeticException r) {
            System.out.println("Có lỗi rồi bạn nhé");
        } catch (InputMismatchException e){
            System.out.println("Nhap số bạn hì");
        } catch (Exception d){
            System.out.println("Co lỗi gì đó");
        } finally {
            System.out.println("ket thuc chuong trình");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(div());
    }
}
