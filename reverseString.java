public class reverseString {
    public static void main(String[] args) {
        String str = "hello";
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            char tempChar = arr[end];
            arr[end] = arr[start];
            arr[start] = tempChar;
            start++;
            end--;
        }

        System.out.println("Reverse using two pointer: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);  
        }
        System.out.println("");

        System.out.println("Just printing using a for loop: ");
        for (int i = str.length()-1; i > -1 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");

        System.out.println("Reverse using StringBuilder's reverse() method: ");

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}
