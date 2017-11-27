package cn.ConstructorThis;

/**
 * Created by qsm on 2017/11/27.
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();    //调用无参数构造函数 ->  无参数构造函数通过this() 调用有参数构造函数
        System.out.println(p1.getName());   //钱思敏
        System.out.println( p1.getAge() );      // 23
    }
}
