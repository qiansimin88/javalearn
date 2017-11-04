/**
 * Created by qsm on 2017/11/4.
 * 测试创建好的customClass类
 *  创建引用类型的格式  JAVA的引用类型 Array 类 接口    引用类型都是指向内存地址
 *      数据类型 变量名 = new 数据类型()
 *  实现 引用类 的步骤
 *      1.导入包（同一个文件夹不需要导入）
 *      2.创建引用类型的实例
 */
public class TestCustomClass {
    public static void main ( String[] args ) {
        CustomClass phone = new CustomClass();
        System.out.println( phone );  //打印出这个类的地址

        //调用类的属性   赋值 或者 取值
        phone.size = 20;
        System.out.println( phone.size ) ;  //20
        System.out.println( phone.color ) ;  //red
    }
}
