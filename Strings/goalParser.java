package Strings;

public class goalParser {
    public static void goal(){
        String command = "(al)G(al)()()G";
        String answer = command.replace("()", "o");
        String s = answer.replace("(al)", "al");
        System.out.println(s);
    }
    public static void main(String[] args) {
        goal();
    }
}
