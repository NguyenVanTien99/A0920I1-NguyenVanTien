package string_regex.practices;

import file.excercises.Main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return  matcher.matches();
    }

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("String: ");
        String string = scanner.nextLine();
        boolean isvalid = emailExample.validate(string);
        System.out.println(isvalid);
    }
}
