package cn.Final;

/**
 * Created by qsm on 2017/11/29.
 * 最终类 不能有子类 无法被继承  只能被实例化 调用 之类的
 */
public final class Fu {
    public void show () {
        System.out.println("父类无法被子类继承");
    }
}