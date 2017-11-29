package cn.Super02;

/**
 * Created by qsm on 2017/11/28.
 *  在子类new的时候 就具有 name和age  所以要在父类的 构造函数中 赋值,并且子类要在 构造函数中 super父类
 */
public class Student extends Person {
    public Student ( String name, int age ) {
        super( name, age );  //调用父类的 构造函数
    }
    public void showInfo () {
        System.out.println(super.getName());
    }
}
