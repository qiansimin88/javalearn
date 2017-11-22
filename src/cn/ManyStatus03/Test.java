package cn.ManyStatus03;

/**
 * Created by qsm on 2017/11/22.
 */
public class Test {
    public static void main(String[] args) {
        Fu tempFu = new Zi();  //形成多态  多态的结构 必须是父类和子类都拥有一个同名的方法
        tempFu.show();
        //强制类型转换： 倘若 tempFu想要 执行Zi独有的的方法  必须强制转换成子类 因为 tempFu是一个Fu类修饰的对象
        //公式  子类类型 x = (子类类型)变量
        Zi changeZi = (Zi)tempFu;  //把父类强制变成子类 和  普通数据类型 大转小 一个道理
        changeZi.haha();  //这是子类特有的方法
    }
}
