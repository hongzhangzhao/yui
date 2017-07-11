
/*
 *  ~ interface可以被public修饰，要和所在文件的名字统一；
 *  ~ interface的域隐式是static final
 *  ~ interface的方法默认是public,子类的覆盖方法的权限必须是public;
 *  ~ interface唯一能够存在的事物就是方法的声明
 *
 */
public interface FaceMian {
	// void method(){} can't
	void method_1();//默认是 public
}