package cn.Constructor02;

/**
 * Created by qsm on 2017/11/26.
 */
public class Person {
    String name;
    int age;
    String type;

    //构造函数支持重载  参数列表不同即可  指的是 参数类型和顺序不同
    //1
    public Person( String name, int age ) {
        System.out.println( name + age );
    }

    public Person( int age , String type) {
        System.out.println( age + type );
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
