package cn.Super02;

/**
 * Created by qsm on 2017/11/28.
 *
 *  继承的思想  共性抽取到父类 让子类继承
 *  成员变量 必须私有化 不让暴露给子类直接使用 必须使用set和get使用
 *  在子类new的时候 就具有 name和age  所以要在父类的 构造函数中 赋值
 */
public class Person {
    private String name;
    private int age;

    //构造函数
    public Person( String name, int age ) {
            this.name = name;
            this.age = age;
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
