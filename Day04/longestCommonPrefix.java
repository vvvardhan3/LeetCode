package Day04;

public class longestCommonPrefix {
    public static String commonPrefix(){
        String[] str = {"flow","flight","flower"};
        if (str.length == 0) {
            return "";
        }
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;

    }
    public static void main(String[] args) {
        String result = commonPrefix();
        System.out.println("Longest common prefix: " + result);
    }
    
}
