package cn.Extends02;

/**
 * Created by qsm on 2017/11/19.
 * Super 用来表示 在当前对象中 包含的父类 对象内存的引用
 */
public class Zi extends Fu {
    int i = 2;
    public void show () {
        int i = 3;
        System.out.println( i );
        System.out.println( this.i );  //2  this只取成员变量 而不是局部变量
        System.out.println( super.i );  // 1   super指的是当前对象的父类
    }
}
