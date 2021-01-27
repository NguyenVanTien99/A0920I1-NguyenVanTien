package string_regex;

public class test {
    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("");
//        stringBuilder.insert(2, "pro");
//        System.out.println(stringBuilder);

        String x = "   CodeGym Viet_Nam    ";
        x = x.trim();
        int index = x.indexOf("_");
        System.out.println(index);
        String y = x.substring(0, index);
        System.out.println(y);
    }
}
