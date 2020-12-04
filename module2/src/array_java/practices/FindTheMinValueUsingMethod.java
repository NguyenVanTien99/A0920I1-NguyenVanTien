package array_java.practices;

public class FindTheMinValueUsingMethod {
    public static int minValue(int[] arr){
        int min = arr[0];
        int id = 0 ;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < min){
                min  = arr[i];
                id = i;
                break;
            }
        }
        return id;
    }
    public static void main(String[] args) {
        int[] array = {2,4,5,8,10,1,43};
        int index = minValue(array);
        System.out.println("the smallest element in the array is " + array[index]);
    }
}
