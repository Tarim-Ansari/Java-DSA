public class maxElement {
    public static void main(String[] args) {
        int arr[] = {12, 7, 25, 3, 18};
        int max = arr[0];

        for (int i=1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is : " + max);
    }
}
