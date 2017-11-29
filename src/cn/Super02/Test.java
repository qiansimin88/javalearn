package cn.Super02;

/**
 * Created by qsm on 2017/11/28.
 */
public class Test {
    public static void main(String[] args) {
        //new 的同事  就已经在各自的类中 调用构造函数了 并且super执行父类的构造函数  进行赋值操作
        Student xiaoming = new Student("小明", 20);
        Worker hanmeimei = new Worker("小红", 12);


        xiaoming.showInfo();   //小明
        System.out.println( hanmeimei.getName() );  //小红
    }
}
