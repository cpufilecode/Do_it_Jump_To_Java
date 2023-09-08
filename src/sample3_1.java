import java.util.ArrayList;
import java.util.Arrays;

public class sample3_1 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(7%3);
        System.out.println(3%7);

        // int i=0;
        int j=10;

        // i++;
        // j--;

        // System.out.println(i);
        // System.out.println(j);

        // System.out.println(i++);
        // System.out.println(i);

        // System.out.println(++i);
        // System.out.println(i);

        char a1='a';
        char a2=97;
        char a3='\u0061';

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        String ab ="happy java";
        String bb="a";
        String bc="123";

        System.out.println(ab);
        System.out.println(bb);
        System.out.println(bc);

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
    }
}
