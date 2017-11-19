package cn.Abstract;

/**
 * Created by qsm on 2017/11/19.
 *  抽象类  : 不可以实例化对象 不可以new,  只可以被子类继承，将抽象类的抽象方法 重写
 *      定义类 开发工程师
 *          java ee : 工作
 *           android: 工作
 *     工具共性抽取工作，形成一个develop的类
 *      定义方法工作，但是 java ee 和 android 如何工作 工作方式  是不同的
 */
public abstract class Develop  {
    //定义工作 但是如何工作 不确定 很抽象, 使用abstract不需要写{}
    //抽象方法 必须存在于抽象的类中 类也需要abstract修饰
    public abstract void work ();
}
