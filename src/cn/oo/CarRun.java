package cn.oo;

/**
 * Created by qsm on 2017/11/14.
 * 测试 自定义的类 car
 * 1.创建Car类的变量
 * 2.调用属性，成员变量
 * 3.调用方法
 */
public class CarRun {
    public static void main (String[] args) {
        //创建Car类的对象
        Car car = new Car();
        car.color = "red";
        car.count = 4;

        car.run();
    }
}
