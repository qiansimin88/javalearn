/**
 * Created by qsm on 2017/10/25.
 * 强制类型转换 把取值范围大的转换成取值范围小的
 *  公式：
 *      被转后的数据类型 变量名 = (被转后的数据类型)要被转的数据
 *      其实就和JS的parseInt()一样 是强制类型转换 人为干预
 */
public class DataConvert_1 {
    public static void main (String[] args) {
        double d = 3.1415;
        int i = (int)d;
        System.out.println( i );   //3

        byte b = (byte)299;
        System.out.println( b );  //43
    }
}
