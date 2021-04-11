package dj.programming.journaldevtopfifty;

import java.util.Arrays;
import java.util.List;

public class ListOfIntegersOnlyContainsOddNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,4,6,9,12,14,16);
        boolean flag = true;
        for (int a : integerList) {
            if (a%2 != 0) {
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}
