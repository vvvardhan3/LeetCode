package Array;

import java.util.ArrayList;

public class CapitalizetheTitle {
    public static void title() {
        String title = "First leTTeR of EACH Word";
        String[] s_title = title.split(" ");
        ArrayList<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        for (String s : s_title) {

            if (s.length() <= 2) {
                list.add(s.toLowerCase());
            } else {
                String capitalizedWord = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
                list.add(capitalizedWord);
            }

        }

        for (String string : list) {
            sb.append(string + " ");
        }

        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        title();
    }
}
