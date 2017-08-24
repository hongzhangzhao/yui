import java.io.*;
import java.util.*;
/**
 * 
 * 使用“持久性” 18.12.3
 * 
*/

class House implements Serializable {}

class Animal implements Serializable {
    private String name;
   // private House preferredHouse;
    // Animal(String nm, House h){
    //     name = nm;
    //     preferredHouse = h;
    // }

    private House preferredHouse = new House();
    Animal(String nm){
        name = nm;
    }
    public String toString(){
        return name + "[" + super.toString() + "], " + preferredHouse + "\n";
    }


}

public class MyWorld {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
       // House house = new House();
        List<Animal> animals = new ArrayList<>();
        // animals.add(new Animal("Bosco the dog", house));
        // animals.add(new Animal("Ralph the hamster", house));
        // animals.add(new Animal("Molly the cat", house));

        animals.add(new Animal("dog"));
        animals.add(new Animal("hamster"));
        animals.add(new Animal("cat"));

        System.out.println("animal: " + animals);
        ByteArrayOutputStream buf1 = new ByteArrayOutputStream();
        ObjectOutputStream o1 = new ObjectOutputStream(buf1);
        //这两个引用指向的同一个对象，相当于一个对象序列化两次？
        o1.writeObject(animals);
        o1.writeObject(animals);

        ByteArrayOutputStream buf2 = new ByteArrayOutputStream();
        ObjectOutputStream o2 = new ObjectOutputStream(buf2);
        o2.writeObject(animals);

        ObjectInputStream in1 = new ObjectInputStream(new ByteArrayInputStream(buf1.toByteArray()));
        ObjectInputStream in2 = new ObjectInputStream(new ByteArrayInputStream(buf2.toByteArray()));

        List 
            animals1 = (List)in1.readObject(),
            animals2 = (List)in1.readObject(),
            animals3 = (List)in2.readObject();

        System.out.println("animals1: " + animals1);
        System.out.println("animals2: " + animals2);
        System.out.println("animals3: " + animals3);

    }
        
    
}
