package cn.Static;

/**
 * Created by qsm on 2017/11/29.
 *  对象的特有数据 （每个实例化的对象都会有，并且都占据自己的内存空间）  非静态  只能是new 出来的对象调用
 *  对象的共享数据 （无论实例多少个对象，被static修饰的 始终指向一个内存地址） 静态 当前类可以直接调用
 */
public class Person {
    String name;
    static int age;
}
