public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        int expectedSum = 0;
        int actualSum = 0;

        for (int i = 1; i <= arr.length; i++) {
            expectedSum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int missing = expectedSum - actualSum;
        
        System.out.println("The missing number is : " + missing);
            
    }
}
