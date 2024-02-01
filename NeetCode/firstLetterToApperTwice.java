package NeetCode;


public class firstLetterToApperTwice {
    public static void letter(){
        String s = "abccbaacz";
        int n = s.length();
        StringBuilder t=new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    t.append(s.charAt(i));
                    break;
                } 
            }
        }
        char newt = t.charAt(0);
        System.out.println(newt);
    }
    public static void main(String[] args) {
        letter();
    }
    
}
