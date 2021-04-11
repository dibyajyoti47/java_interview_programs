package dj.programming.journaldevtopfifty;

public class CheckIfANyVowelPresentInString {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String string = "hrtyhgfrds";
        boolean vowelpresent = false;
        for (int i=0; i< vowels.length; i++) {
            if (string.contains(vowels[i]+"")) {
                vowelpresent=true;
                break;
            }
        }
        System.out.println(vowelpresent);
    }

}
