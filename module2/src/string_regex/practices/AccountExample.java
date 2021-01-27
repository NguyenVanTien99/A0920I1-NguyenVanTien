package string_regex.practices;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample(){
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
