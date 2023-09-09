import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Sample3_3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));
        map.put("people", "사람");
        map.put("baseball", "야구");
        // System.out.println(map.get("people"));
        // System.out.println(map.containsKey("people"));
        // System.out.println(map.remove("people"));
        // System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(set);
    }
}
