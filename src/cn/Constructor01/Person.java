package cn.Constructor01;

/**
 * Created by qsm on 2017/11/26.
 *  构造函数： 在New的同时  对成员变量赋值, 给对象属性初始化赋值
 *  方法定义格式
 *      权限 方法名(参数列表) {  没有返回值类型概念  方法名和类名必须一致
 *
 *      }
 */
public class Person {
    private String name;
    private int age;

    //定义构造方法  会在new的时候立即执行
    public Person ( String name, int age ) {
        this.name = name;
        this.age = age;
        System.out.println("我Person类的构造方法" + this.name + this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
