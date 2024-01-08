import java.util.HashMap;

public class romanToInteger {
    public static int roman(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV"; // Example Roman numeral
        int result = roman(romanNumeral);
        System.out.println("Integer value of the Roman numeral " + romanNumeral + " is: " + result);
    }
}
