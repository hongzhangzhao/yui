package mypack;

import java.util.*;
public class ReverseStringComparator implements Comparator{

  public int compare(Object o1,Object o2){
    String s1=(String)o1;
    String s2=(String)o2;

    if(s1.compareTo(s2)>0) return -1;
    if(s1.compareTo(s2)<0) return 1;

    return 0;
  }
}