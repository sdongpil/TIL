package programmers;

import java.util.Arrays;
import java.util.List;

public class Test1 {


    public String solution() {
        List<String> stringList = Arrays.asList("abc", "de", "fg");
        String ex = "g";

        String[] strings = {"abc", "db"};

        StringBuilder stringBuilder = new StringBuilder();

        for (String s : strings) {
            if (!s.contains(ex)) {
                 stringBuilder.append(s).toString();
            }
        }

        return stringBuilder.toString();
    }
}
