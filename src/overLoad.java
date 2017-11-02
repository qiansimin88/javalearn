/**
 * Created by qsm on 2017/11/2.
 *  方法的重载
 *   在同一个类中，允许出现同名的方法，只要方法的参数列表不同即可
 *   参数列表不同： 参数的个数，数据类型， 顺序 都可
 */
public class overLoad
{
    public static void main ( String[] args ) {
        System.out.println(  getSum(0.2 , 0.3) );
        System.out.println(  getSum(0.2 , 1) );
        System.out.println(  getSum(3 , 1, 5) );
    }

    public static int getSum ( int a, int b ) {
        System.out.println( "两个int参数" );
        return a + b;
    }

    public  static int getSum( int a, int b, int c ) {
        System.out.println( "三个int参数" );
        return a + b + c;
    }

    public static double getSum ( double a, double b ) {
        System.out.println( "两个double参数" );
        return a + b;
    }
}
