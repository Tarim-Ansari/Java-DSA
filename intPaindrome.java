public class intPaindrome {
    // public boolean isPalindrome(int x){
    //     String z = Integer.toString(x);
    //     int n = z.length();
    //     int start = 0;
    //     int end = n-1;

    //     while(start <= end){
    //         if(z.charAt(start) != z.charAt(end)){
    //             return false;
    //         }
    //         start++;
    //         end--;
    //     }return true;

    // }

    public static void main(String[] args) {

        int x = 121;
        int original = x;
        int temp = 0;
        int y = 0;

        while (x>0) {
            temp = x%10;
            y = (y*10) + temp;
            x = x/10;
        }
        System.out.println(y);

        if(original == y && original >0){
            System.out.println("Given number is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
    
}
