import java.util.HashMap;

public class firstUnique {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 5, 3, 2, 6, 7, 7};

        HashMap<Integer , Integer> map = new HashMap<>();

        for (int num : arr){
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(map);

        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println(num);
                break;
            }
            
        }
    }
}
