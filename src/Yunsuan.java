/**
 * Created by qsm on 2017/10/26.
 * java中的 运算特别的地方
 */
public class Yunsuan {
    public static void main (String[] args) {
        byte b = 29;
             b = (byte)(b + 1);   //b是byte 1默认是Int  相加 b会被转成Int 必须（byte） 不然会出现问题
        System.out.println( b );

        byte b1 = 30;
             b1 += 2;  //等同于  b1 = (byte)(b1 + 2);
        System.out.println( b1 );
    }
}
