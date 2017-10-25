/**
 * Created by qsm on 2017/10/25.
 *
 * 类型转换：
 *      自动：取值范围小的类型，自动转换成取值范围大的类型；
 */
public class DataConvert {
    public static void main (String[] args) {
        //定义double类型的变量
        double d = 1000; //int类型的1000自动转换成浮点型的double类型
        System.out.println( d );  //1000.0
    }
}
