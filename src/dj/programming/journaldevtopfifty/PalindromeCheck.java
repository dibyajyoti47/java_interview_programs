package dj.programming.journaldevtopfifty;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "kattap";
        boolean flag = true;
        for (int i=0;i<=s.length()/2;i++) {
            if(s.charAt(i)!= s.charAt(s.length()-1-i)) flag=false;
        }
        System.out.println(flag);
    }
}
