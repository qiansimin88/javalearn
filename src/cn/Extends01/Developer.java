package cn.Extends01;

/**
 * Created by qsm on 2017/11/17.
 * 开发者是工作者的子类  继承父类所有的 非私有成员变量和方法
 */
public class Developer extends WorkMan {
    //在子类中 可以定义自己的方法
    public void printerName () {
        System.out.println( name );
    }
}
