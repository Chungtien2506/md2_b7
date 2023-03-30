package Comparable;

public class CircleComparator {
    public  int compare(Cricle c1,Cricle c2){
        if(c1.getRadius()> c2.getRadius()) return 1;
        else if (c1.getRadius()<c2.getRadius()) return -1;
        else  return 0;
    }
}
