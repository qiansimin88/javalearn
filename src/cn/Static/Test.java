package cn.Static;

/**
 * Created by qsm on 2017/11/29.
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "呵呵";
        p2.name = "嘻嘻";

        System.out.println(p1.name);  //呵呵   每个对象都有自己的独有的内存地址 来存贮普通成员变量
        System.out.println(p2.name);  //嘻嘻

        p1.age = 20;
        System.out.println( p2.age );  //也是 20  因为age是静态类型 是被共享的 始终指的是一个内存地址

        System.out.println( Person.age );  //不需要被实例化（也可以实例化调用） 可以直接用 类名调用
     }
}
