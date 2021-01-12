package dsa_stack_queqe.exercises.count_the_number_of_occurremces_of_each_word_in_a_string_using_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = input.nextLine();
        string = string.replaceAll(",","");
        String arr[] = string.split(" ");
        String key = "";
        Integer value;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            key = arr[i];
            if(map.containsKey(key)){
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            }else {
                map.put(key,1);
            }
        }
        Set<String> keys = map.keySet();
        for (String keyw : keys){
            System.out.println("the words " + keyw + " appearances " + map.get(keyw) + " times");
        }


        System.out.println(string);
    }
}
