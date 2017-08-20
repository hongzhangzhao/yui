package IO.IO18dot1;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * 1 File类不仅代表一个特定文件的名称，又代表一个目录下一组文件的名称
 */
public class DirList {
    public static void main(String[] args) {
        File path = new File(".");  //代表当前路径名
        String[] list;
        if (args.length == 0)
            list = path.list();  //获得目录下所有文件
        else
            list = path.list(new DirFilter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER); //对获取到的文件进行排序
        for (String dirItem : list)     //便利并打印文件和目录名
            System.out.println(dirItem);
    }
}

class DirFilter implements FilenameFilter {  //过滤文件，获得返回true的文件和目录名
    private Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    public boolean accept(File dir, String name) { //过滤器唯一的方法，返回true则表示保留符合规则的文件，false则不保留
        return pattern.matcher(name).matches();
    }
}