public class freqOfElement {
    public static void main(String[] args) {
        int arr[] = {2,4,2,5,4,2};
        int count = 0;
        int key = 2;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                count ++;
            }
        }
        System.out.println("Count of element : " + key + " is " + count);
    }
}
