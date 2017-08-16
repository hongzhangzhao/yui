package IO.IO18dot1;

import java.util.regex.*;
import java.io.*;
import java.util.*;


public final class Directory {
    public static File[] local(File dir, final String regex) { //获得dir目录下的所有目录
        return dir.listFiles(
                new FilenameFilter() {
                    private Pattern pattern = Pattern.compile(regex);

                    public boolean accept(File dir, String name) {
                        return pattern.matcher(new File(name).getName()).matches();
                    }
                }

        );
    } //local()

    public static File[] local(String path, final String regex) { //获取path下的所有文件
        return local(new File(path), regex);
    }

    public static class TreeInfo implements Iterable<File> { //用来保存遍历之后的文件和目录
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        public Iterator<File> iterator() {
            return files.iterator();
        }

        public void addAll(TreeInfo other) { //把其他的TreeInfo中的文件和目录保存到此TreeInfo中
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        public String toString() {
            return "dirs:";
        }

    }

    public static TreeInfo walk(String start, String regex) {
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start, String regex) {
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(File start) {
        return recurseDirs(start, ".*");
    }

    public static TreeInfo walk(String start) {
        return recurseDirs(new File(start), ".*");
    }

    static TreeInfo recurseDirs(File startDir, String regex) {//获得startDir目录下的所有的文件
        TreeInfo result = new TreeInfo(); //保存遍历之后的路径名
        for (File item : startDir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex)); //难点
            } else if (item.getName().matches(regex)) {
                result.files.add(item);
            }
        }
        return result;
    }
}
