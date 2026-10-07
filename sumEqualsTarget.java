public class sumEqualsTarget {
    public static void main(String[] args) {
        int arr[] = {8, 2, 6, 11, 4};
        int target = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    System.out.println("Numbers at index " + i + " and " + j + " : " + arr[i] + " + " + arr[j] + " = " + target);
                }
                
            }
            
        }
    }
}
