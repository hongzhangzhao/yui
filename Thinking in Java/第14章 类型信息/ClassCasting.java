package Generics;

/**
 * 15.11.3
 *
 */
import java.io.*;
import java.util.*;

public class ClassCasting {
    @SuppressWarnings("unchecked")
    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));

        //List<Widget> lw1 = List<Widget>.class.cast(in.readObject());

        List<Widget> lw2 = List.class.cast(in.readObject());

    }
}
