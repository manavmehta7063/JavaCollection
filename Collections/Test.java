import java.util.*;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.customSortString("cba", "abcd");
       
    }
}
class Solution {
    public String customSortString(String order, String s) {
        StringBuffer result=new StringBuffer("");
        HashMap<Character,Integer> hm = new HashMap<>();
        Character[] chars= new Character[s.length()];

        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), -1);   
            chars[i]=s.charAt(i);

        }

        for (int i = 0; i < order.length(); i++) {
            if(hm.containsKey(order.charAt(i))){
                hm.put(order.charAt(i), i);
            }
        }

        // System.out.println(hm);

        

        // Sort the character array based on custom indices using a custom comparator
        Arrays.sort(chars, (a, b) -> {
            int indexA = hm.getOrDefault(a, Integer.MAX_VALUE);
            int indexB = hm.getOrDefault(b, Integer.MAX_VALUE);
            return Integer.compare(indexA, indexB);
        });

        for (int i = 0; i < chars.length; i++) {
            result.append(chars[i]);
        }
        // System.out.println(result);
        return result.toString();
    }
}