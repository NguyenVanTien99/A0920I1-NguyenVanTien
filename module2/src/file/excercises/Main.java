package file.excercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String PATH_FILE_1 = "src\\file\\excercises\\1.csv";
    public static final String PATH_FILE_2 = "src\\file\\excercises\\2.csv";
    public static final String COMMA = " , ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id");
        int id  = scanner.nextInt();
        System.out.println("Enter the name");
        scanner.nextLine();
        String name = scanner.nextLine();
        Customer customer1 = new Customer(id,name);
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);

        try {
            FileWriter fileWriter = new FileWriter(PATH_FILE_1, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line = null;

            for (Customer customer : customerList){
                line = customer.getId() + COMMA + customer.getName();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.close();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
