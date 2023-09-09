import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample3_2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // sb.append("hello");
        // sb.append(" ");
        // sb.append("jump to java");
        //  String result = sb.toString();
        // System.out.println(result);

        String result ="";
        result += "Hello";
        result += " ";
        result += "jump to java";
        System.out.println(result);

        sb.append("jump to java");
        sb.insert(0,"hello ");
        System.out.println(sb.toString());

        sb.append("Hello jump to java");
        System.out.println(sb.substring(0,4));

        String[] weeks={"월","화","수","목","금","토","일"};
        System.out.println(weeks[3]);

        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }

        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        // System.out.println(pitches.get(1));
        // System.out.println(pitches.size());
        // System.out.println(pitches.contains("142"));
        //  System.out.println(pitches.remove("129"));
        System.out.println(pitches);
        String[] data = {"304","934","293"};
        ArrayList<String> pit = new ArrayList<>(Arrays.asList(data));
        System.out.println(pit);

        ArrayList<String> pit1 = new ArrayList<>(Arrays.asList("45","42","75"));
        System.out.println(pit1);

        ArrayList<String> pit2 = new ArrayList<>(Arrays.asList("45","42","75"));
        String use  = String.join(",",pit2);
        System.out.println(use);

        ArrayList<String> pit3 = new ArrayList<>(Arrays.asList("45","42","75"));
        pit3.sort(Comparator.naturalOrder());
        System.out.println(pit3);

    }
}
