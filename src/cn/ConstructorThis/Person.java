package cn.ConstructorThis;

/**
 * Created by qsm on 2017/11/27.
 */
public class Person {
    private String name;
    private int age;

    //写两个重载的构造函数
    public Person() {   //无参数 构造函数
        this( "钱思敏" , 23 );   //this()必须写在第一行 意思是执行同名构造函数  并且可以赋值  方便写默认值
    }

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
