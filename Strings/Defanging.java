package Strings;

public class Defanging {
    public static void address(){
        String address = "1.1.1";
        System.out.println(address.replace(".", "[.]"));

    }
    public static void main(String[] args) {
        address();
    }
}
