package dj.programming.journaldevtopfifty;

public class ReverseString {
    public static void main(String[] args) {
        String string = "aman";
        String reversedString = "";
        for (int i=string.length()-1; i>=0; i--) {
            reversedString+=string.charAt(i);
        }
        System.out.println(reversedString);
    }
}
