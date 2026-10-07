public class minElement {
    public static void main(String[] args) {
        int arr[] = {14, 9, 21, 2, 17};
        int min = arr[0];

        for (int i=1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum element is : " + min);
    }
}
