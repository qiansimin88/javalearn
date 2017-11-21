package cn.Interface01;

/**
 * Created by qsm on 2017/11/20.
 */
public class Test {
    public static void main ( String[] args ) {
        //实例化 实现类
        Implements temp = new Implements();
        temp.Handler();

        //使用接口的常量  由于是常量是static  所以不需要new  可以直接调用
        System.out.println(MyInterFace.x);
    }
}
