package cn.Final02;

/**
 * Created by qsm on 2017/11/29.
 * 定义final 方法   父类可以被子类继承 子类无法重写 父类的final方法 只可以使用
 * final修饰的变量 不可以改变  和 js const一个意思
 */
public class Fu {
    public final void show () {
        System.out.println("父类的final方法  不可以重写");
    }
    public  void hehe () {
        System.out.println("父类的普通方法 可以重写");
    }

    public static void main (String[] args) {
        final int i = 10;
        System.out.println(i); //10
//        i = 20;  //    不能被重写
    }
}
