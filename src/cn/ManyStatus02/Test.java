package cn.ManyStatus02;

/**
 * Created by qsm on 2017/11/22.
 *  多态 成员变量的特点
 */
public class Test {
    public static void main(String[] args) {
        Fu fu = new Zi();
        System.out.println( fu.a );  //这是其实打印的是父类的A  1，  因为  变量类型就是Fu类，这是多态的特点 和多态的方法 是不同的
    }
}
