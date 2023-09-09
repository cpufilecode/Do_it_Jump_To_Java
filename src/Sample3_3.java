import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Sample3_3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // HashSet<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));
        map.put("people", "사람");
        map.put("baseball", "야구");
        // System.out.println(map.get("people"));
        // System.out.println(map.containsKey("people"));
        // System.out.println(map.remove("people"));
        // System.out.println(map.size());
        System.out.println(map.keySet());
        // System.out.println(set);

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        // HashSet<Integer> intersection = new HashSet<>(s1);
        // intersection.retainAll(s2);
        // System.out.println(intersection);

        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);

        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);
        System.out.println(substract);

        HashSet<String> set = new HashSet<>(Arrays.asList("Jump","To","Java"));
        /* set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);
        set.add("Java");
        set.addAll(Arrays.asList("To","Java"));
        System.out.println(set);
         */
        set.remove("To");
        System.out.println(set);
    }
}
