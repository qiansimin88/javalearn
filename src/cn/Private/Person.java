package cn.Private;

/**
 * Created by qsm on 2017/11/15.
 *  新的关键字： private(私有)，仅仅能在成员变量前修饰，局部变量无法使用, 其他的外部类便无法使用该成员变量赋值和操作都不行，
 *             只能在自己的本类使用
 *  对私有变量 提供 公共的访问方式： 提供方法使用
 *
 */
public class Person {
    //定义成员变量  成员变量会有默认值
    private int age;   //私有变量
    String name;
    public void speak(){
        System.out.println( name + "....." + age );
    }

    //暴露设置方法供其他类  使用 private 成员变量, 方法名必须set开头 + 变量名
    public void setAge ( int a ) {
        //可以在这个set方法内 对 私有private变量进行限制  这样就提现了 private的安全有点 防止其他类随意更改赋值
        if( a < 0 || a > 20) {
            age = 20;
        }else {
            age = a;
        }
    }
    //暴露读取方法供其他类  使用 private 成员变量, 方法名必须get开头 + 变量名
    public int getAge() {
        return age;
    }
}
