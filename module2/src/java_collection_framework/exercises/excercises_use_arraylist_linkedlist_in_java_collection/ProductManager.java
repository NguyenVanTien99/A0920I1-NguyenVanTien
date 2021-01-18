package java_collection_framework.exercises.excercises_use_arraylist_linkedlist_in_java_collection;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    public static ArrayList<Product> listProduct = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void addProduct(){
        System.out.println("Enter the id");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter the name");
        String name = input.nextLine();
        System.out.println("Enter the price");
        Double price = input.nextDouble();
        Product product = new Product(id, name, price);
        listProduct.add(product);
    }

    public static void showProduct(){
        if(listProduct.size() == 0){
            System.out.println("No product in here");

        }else {
            for(Product product : listProduct){
                System.out.println(product);
            }
        }

    }

    public static void editNameProductById(){
        System.out.println("Enter id of product you want edit ");
        int idProduct = input.nextInt();
        input.nextLine();


        for(int i = 0; i < listProduct.size(); i++){
            if(idProduct == listProduct.get(i).getId()){
                System.out.println(listProduct.get(i));
                System.out.println("Enter the name you want edit");
                String name = input.nextLine();
                listProduct.get(i).setName(name);
                System.out.println(listProduct.get(i));
            }
        }

    }

    public static void editPriceProductById(){
        System.out.println("Enter id of product you want edit");
        int idProduct = input.nextInt();
        input.nextLine();
        for (int i = 0; i < listProduct.size(); i++){
            if(idProduct == listProduct.get(i).getId()){
                System.out.println(listProduct.get(i));
                System.out.println("Enter the price you want edit");
                Double price = input.nextDouble();
                listProduct.get(i).setPrice(price);
                System.out.println(listProduct.get(i));

            }
        }
    }

    public static void removeProductById(){
        System.out.println("Enter id of product you want remove");
        int idProduct = input.nextInt();
        input.nextLine();
        for (int i = 0; i < listProduct.size(); i++){
            if(idProduct == listProduct.get(i).getId()){
                listProduct.remove(i);
                System.out.println("removed successfully");
            }
        }
    }

    public static void searchProduct(){
        System.out.println("Enter the name of product you want search");
        input.nextLine();
        String nameProduct = input.nextLine();
        for (int i = 0 ; i < listProduct.size(); i++){
            if (nameProduct.equals(listProduct.get(i).getName())){
                System.out.println(listProduct.get(i));
            }
        }
    }

    public static void sortIncrementByPrice(){
        Collections.sort(listProduct, new SortIncrement());
        System.out.println(listProduct);
    }

    public static void sortDescendingByPrice(){
        Collections.sort(listProduct, new SortDescending());
        System.out.println(listProduct);
    }

    public static void menu(){
        System.out.println(
                        "1.Add new product \n" +
                        "2.Show product \n" +
                        "3.Edit information product \n" +
                        "4.remove product \n" +
                        "5.search product by name \n" +
                        "6.sort product \n"
        );

        int choose = input.nextInt();
        switch (choose) {
            case 1:
                addProduct();
                menu();
                break;
            case 2:
                showProduct();
                menu();
                break;
            case 3:
                System.out.println("1. Edit name");
                System.out.println("2. Edit price");
                int chooseEdit = input.nextInt();
                switch (chooseEdit){
                    case 1:
                        editNameProductById();
                        menu();
                        break;
                    case 2:
                        editPriceProductById();
                        menu();
                        break;
                }
                break;
            case 4:
                removeProductById();
                menu();
                break;
            case 5:
                searchProduct();
                menu();
                break;
            case 6:
                System.out.println("1. Increment");
                System.out.println("1. Descending");
                int chooseSort = input.nextInt();
                switch (chooseSort){
                    case 1:
                        sortIncrementByPrice();
                        menu();
                        break;
                    case 2:
                        sortDescendingByPrice();
                        menu();
                        break;
                }
                break;
            default:
                System.out.println("Enter number 1 to 7");
                break;

        }

    }









}
