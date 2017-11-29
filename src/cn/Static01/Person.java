package cn.Static01;

/**
 * Created by qsm on 2017/11/29.
 *  静态环境或方法中 不能使用和调用 非静态变量和方法  并且不能使用 this和super 因为this指的是实例的对象 而静态方法不属于实例方法
 *   因为生命周期
 *   静态方法和变量 是先于  非静态 在内存中的
 *   所以在静态中 无法使用 非静态 因为 非静态还不存在内存中呢
 *
 */
public class Person {
    String name = "钱思敏";
    static int age = 20;

    public static void main ( String[] args ) {
//        System.out.println( name );     //无法调用非静态的name
        System.out.println( age );  //20 在静态方法main中只能调用 静态变量  age

        //如果非要在静态方法中调用静态的变量或者方法 则要实例化
        Person item = new Person();
        System.out.println(item.name);   //钱思敏
    }
}
