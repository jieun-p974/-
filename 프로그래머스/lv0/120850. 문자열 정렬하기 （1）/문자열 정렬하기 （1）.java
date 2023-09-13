import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String[] a = my_string.replaceAll("[^0-9]","").split("");
        int[] arr = new int[a.length];
        Arrays.sort(a);        
        
        for(int i = 0; i < a.length; i++){
            arr[i] = Integer.parseInt(a[i]);
        }
        
        
        return arr;
    }
}