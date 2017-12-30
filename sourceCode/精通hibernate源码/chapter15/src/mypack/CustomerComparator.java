package mypack;

import java.util.*;
public class CustomerComparator implements Comparator{

  public int compare(Object o1,Object o2){
    Customer c1=(Customer)o1;
    Customer c2=(Customer)o2;

    if(c1.getName().compareTo(c2.getName())>0) return -1;
    if(c1.getName().compareTo(c2.getName())<0) return 1;

    return 0;
  }
}