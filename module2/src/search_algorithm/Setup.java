package search_algorithm;

public class Setup {
    public static int binarySearch(int list[], int key){
        int low = 0;
        int high = list.length - 1;
        while (high >= low){
            int mid = (low + high);
            if(key < list[mid]){
                high = mid - 1;
            }else if(key == list[mid]){
                return mid;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
    int binarySearch(int arr[], int low, int high, int value) {
        if (high>=low) {
            int mid = low + (high - low)/2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, low, mid-1, value);
                return binarySearch(arr, mid+1, high, value); }
        return -1; }
}

class test extends Object {
    @Override
    public String toString() {
        return super.toString();
    }


}
