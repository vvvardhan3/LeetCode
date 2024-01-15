package Day11;

public class firstOccurrenceInString {
    public static void string(){
        String a = "sadbutsad";
        String occurenceString = "ad";

        int index = a.indexOf(occurenceString);

        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("Substring is not found!");
        }        
    }

    public static void main(String[] args) {
        string();
        
    }
}
