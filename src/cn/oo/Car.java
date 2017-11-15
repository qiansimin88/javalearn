package cn.oo;

/**
 * Created by qsm on 2017/11/14.
 * 类： 描述现实中的熊汽车
 *  小汽车的 属性和功能
 *      属性：颜色 轮胎个数 变量定义
 *      功能： 跑  方法
 *
 *      属性 =》 成员变量
 *      功能 =》 成员方法
 */
public class Car {
    //属性
    String color;
    int count;

    //跑 功能
    public void run () {
        System.out.println("小汽车在跑..." + color + "...." + count);
    }
}
