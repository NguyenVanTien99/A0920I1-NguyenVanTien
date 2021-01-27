package string_regex.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    public static boolean checkInputName(String name) {
        String regex = "(C|A|P)\\d{4}(G|H|I|K|L|M)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("Enter the class name");
            name = scanner.nextLine();

        } while (!checkInputName(name));

        if (checkInputName(name) == true){
            System.out.println("yup, you right");
        }

    }
}
