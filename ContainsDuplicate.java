
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(set.contains(num)){
                System.out.println("Contains Duplicate");
                break;
            }
            else{
                set.add(num);
            }
        }
    }
}
