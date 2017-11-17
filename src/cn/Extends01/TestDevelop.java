package cn.Extends01;

/**
 * Created by qsm on 2017/11/17.
 * 测试develop的继承
 */
public class TestDevelop {
    public static void main ( String[] args ) {
        Developer front = new Developer();
        front.name = "qiansimin";    //name 是 develop继承自workman的成员变量
        System.out.println( front.name );
        front.toWork();             //towork 是 develop实例 继承自 workman的方法
        front.printerName();   //front实例 构造函数 develop中声明的方法
    }
}
