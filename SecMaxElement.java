public class SecMaxElement {
    public static void main(String[] args) {
        int arr[] = {18, 18, 17, 16};
        int max = arr[0];

        for (int i=1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            
        }
        System.out.println("Maximum element is : " + max);

        int max2 = 0;

        for(int i=0; i < arr.length; i++){
            if(max2 < arr[i] && arr[i] != max ){
                max2 = arr[i];
            }
        }
        System.out.println("Second largest number is : " + max2);
    }
}
