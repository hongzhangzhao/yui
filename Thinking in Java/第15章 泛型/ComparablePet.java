package Generics;

/**
 *
 * 15.11.5
 *
 */
public class ComparablePet implements Comparable<ComparablePet>{

    public int compareTo(ComparablePet arg){
        return 0;
    }


}

//class Cat extends ComparablePet implements Comparable<Cat>{ //参数
//
//    public int compareTo(Cat arg){
//        return 0;
//    }
//}

class Hamster extends ComparablePet implements Comparable<ComparablePet>{
    public int conpareTo(ComparablePet arg){
        return 0;
    }
}

class Gecko extends ComparablePet {
    public int compareTo(ComparablePet arg){
        return 0;
    }
}
