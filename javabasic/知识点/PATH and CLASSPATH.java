Path :
	告诉系统你要执行的程序要到哪里去找
	"c:\java\jdk1.7.0\bin\javac" HelloWorld.java
	echo %PATH% //显示path信息
	set path=......... 临时的 关闭就失效
	
	
	path and classpath 是不同层次的环境变量
	
jvm(java) and CLASSPATH:
	jvm也是一个系统，它能执行.class文件
	
	java -classpath d:\workspace HelloWorld
	
	java -cp c:\workspace\hongz.jar Good //jar文件可以用 * 代替
	
	set classpath=...........
	
	
javac and classpath:
	一个x.java文件中使用了一个y.class文件，
	在编译的时候要指定.class文件的位置才ok,
	
	javac -cp yofpath x.java
	