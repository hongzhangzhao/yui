package IO.IO18dot1;

import java.io.*;

public class DirectoryDemo {
    public static void main(String[] args){
        PPrint.pprint(Directory.walk(".").dirs);
        for(File file : Directory.local(".","T.*")){
            System.out.println(file);
        }
        for(File file : Directory.walk(".","T.*\\.java")){
            System.out.println(file);
        }
        for(File file : Directory.walk(".",".*[Zz].*\\.class")){
            System.out.println(file);
        }
    }


}
