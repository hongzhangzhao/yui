package Arrays;

/**
 * 实现Comparator
 *
 */
import java.util.*;

 class CompTypeComparator implements Comparator<CompType> {
    public int compare(CompType o1 , CompType o2){
        return o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1);
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        CompType[] a  = Generated.array(new CompType[12],CompType.generator());
        System.out.println(Arrays.toString(a));

        Arrays.sort(a,new CompTypeComparator());  //传递Comparator的实现类，就可以调用比较的方法


        System.out.println(Arrays.toString(a));


    }
}
