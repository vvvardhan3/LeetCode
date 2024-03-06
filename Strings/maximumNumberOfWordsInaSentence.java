package Strings;

public class maximumNumberOfWordsInaSentence {
    public static void maximum() {
        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        int count = 0;
        for (String s : sentences) {
           int currentLength = s.split(" ").length;
           if (count < currentLength) {
                count = currentLength;
           }
        } System.out.println(count);
    }

    public static void main(String[] args) {
        maximum();
    }
}
