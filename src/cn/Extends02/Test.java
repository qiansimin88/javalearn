package cn.Extends02;

/**
 * Created by qsm on 2017/11/19.
 * 集成后 分析 子类和父类成员变量的特点
 */
public class Test {
    public static void main ( String[] args )  {
        Zi newZi = new Zi();
        System.out.println( newZi.i );   //2  因为调用者是子类的实例 所以是子类的成员变量i

        newZi.show();   //2  因为newZi是Zi类的实例 调用的是Zi类中的i 就近原则嘛 Zi类没有采用Zi的父类的
    }
}
