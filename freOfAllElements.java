public class freOfAllElements {
    public static void main(String[] args) {
        int arr[] = {2,4,2,5,4,2};
        boolean visited[] = new boolean[arr.length]; //visited [F,F,F,F,F,F]

        for (int i = 0; i < visited.length; i++) {
            int count = 0;
            int key = arr[i];

            if(visited[i]){
                continue;
            }

            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == key){
                    count ++;
                    visited[j] = true;  
                }
            }
            
            System.out.println("Count of element : " + key + " is " + count);
        
    }
}}
