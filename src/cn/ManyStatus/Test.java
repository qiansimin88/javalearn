package cn.ManyStatus;

/**
 * Created by qsm on 2017/11/22.
 * 接口 抽象类 类 都可以实现多态
 *  编译看父类(有成功 没有失败)  运行看子类(有 运行子类 没有运行父类)
 */
public class Test {
    public static void main( String[] args ) {
        //  多态
        //  公式： 父类类型或者是接口类型 变量 = new 子类();
        Fu f = new Zi();
        f.show();  //这是子类  若子类没有这个方法则运行父类的show（） 这个和多态的成员变量的 特点是截然不同的
                   //  若父类没有show()方法 则编译失败  父类必须要有这个方法，但是执行的是子类的show()
    }
}
