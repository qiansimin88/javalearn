/**
 * Created by qsm on 2017/10/26.
 * 引用数据类型 scanner java自带的类
 * 定义引用数据类型的变量和基本数据类型有区别
 *
 *      int a = 1;
 *
 *      引用:
 *          类型 变量名 = new 类型();
 *
 *     scanner类，作用，让我们在命令行中 接受键盘的输入
 */
import java.util.Scanner;   //导入工具包
public class ScannerDemo {
    public static void main ( String[] args ) {
        Scanner keyboard = new Scanner( System.in );
        int getIntNum = keyboard.nextInt();  //接受键盘输入 并且是正数 并且返回整数
        System.out.println( getIntNum );

        String getString = keyboard.next();  //接受字符串数据
        System.out.println( getString );
    }
}
