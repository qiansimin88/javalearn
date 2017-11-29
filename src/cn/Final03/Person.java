package cn.Final03;

/**
 * Created by qsm on 2017/11/29.
 * final 修饰成员变量 ： 成员变量是在堆内存内的 并且都具有默认值 但是final修饰的话  是不认默认值的 所有必须手动赋值 才可以用final修饰
 *
 * 赋值方式
 *  1.定义直接赋值
 *  2.在构造函数里面赋值 因为构造函数是  实例化就运行的 所以也就赋值了
 */
public class Person {
    final int age = 20;

    public Person () {
//        this.age = 30;  //也是可以的
    }
}
