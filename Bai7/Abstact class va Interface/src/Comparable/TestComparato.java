package Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparato {
    public static void main(String[] args) {
        Cricle[] cricles = new Cricle[3];
        cricles[0] =new Cricle(2.5);
        cricles[1]=new Cricle();
        cricles[0] =new Cricle(2.6);
        System.out.println("tien");
        for (Cricle cricle:cricles){
            System.out.println(cricle);
        }
        Comparator circleComparator = (Comparator) new CircleComparator();
        Arrays.sort(cricles,circleComparator);
        System.out.println("chung");
        for (Cricle cricle:cricles){
            System.out.println(cricle);
        }
    }
}
