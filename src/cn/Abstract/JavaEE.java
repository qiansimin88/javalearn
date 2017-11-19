package cn.Abstract;

/**
 * Created by qsm on 2017/11/19.
 * 定义 javaee开发类
 *  继承抽象类 develop ,重写抽象的方法
 */
public class JavaEE extends Develop {
    //重写父类的抽象方法  去掉abstract 加上 方法主题
    public void work () {
        System.out.println("java ee 工程师在开发软件");
    }
}
