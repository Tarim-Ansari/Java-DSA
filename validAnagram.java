import java.util.HashMap;

public class validAnagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "sileent";
        boolean anagram = false;

        if (s.length() != t.length()) {
            System.out.println("Not anagram");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()){
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
                
            }
            else{
                map.put(ch, 1);
            }   
        }
        System.out.println(map);

        for(char ch : t.toCharArray()){
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1); 
                anagram = true;
            }
            else{
                anagram = false;
            }
        }

        if (anagram) {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
        // HashMap<Character, Integer> map2 = new HashMap<>();

        // for (char ch : t.toCharArray()){
        //     if (map2.containsKey(ch)) {
        //         map2.put(ch, map2.get(ch) + 1);
                
        //     }
        //     else{
        //         map2.put(ch, 1);
        //     }
        // }
        // System.out.println(map2);
        // if(map.equals(map2)){
        //     System.out.println("Anagram");
        // }
        // else{
        //     System.out.println("Not Anagram");
        // }
    }
}
